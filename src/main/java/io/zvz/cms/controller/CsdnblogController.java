package io.zvz.cms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.zvz.cms.entity.CsdnblogEntity;
import io.zvz.cms.service.CsdnblogService;
import io.zvz.cms.utils.webmagicBlog;
import io.zvz.cms.utils.webmagicPipeline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import io.renren.utils.PageUtils;
import io.renren.utils.R;
import us.codecraft.webmagic.Spider;


/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-04-16 16:28:53
 */
@Controller
@RequestMapping("csdnblog")
public class CsdnblogController {
	@Autowired
	private CsdnblogService csdnblogService;


	@RequestMapping("/csdnblogSave.html")
	public String savePage(){
		return "/csdnblog/csdnblogSave.html";
	}

	@RequestMapping("/csdnblogList.html")
	public String list(){
		return "/csdnblog/csdnblogList.html";
	}
	/**
	 * 列表
	 */
	@ResponseBody
	@RequestMapping("/list")
	public R list(@RequestParam(value="page", required=false)Integer page,
				  @RequestParam(value="limit", required=false)Integer limit,
				  @RequestParam(value="keyword", required=false)String keyword){
		Map<String, Object> map = new HashMap<>();
		map.put("offset", (page - 1) * limit);
		map.put("limit", limit);
		map.put("keyword", keyword);

		//查询列表数据
		List<CsdnblogEntity> csdnblogList = csdnblogService.queryList(map);
		int total = csdnblogService.queryTotal(map);

		PageUtils pageUtil = new PageUtils(csdnblogList, total, limit, page);

		return R.ok().put("page", pageUtil);
	}


	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	public String info(@PathVariable("id") Integer id,Model model){
		CsdnblogEntity csdnblog = csdnblogService.queryObject(id);
		model.addAttribute("csdnblog", csdnblog);
		return "/csdnblog/csdnblogDetail.html";
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public String save(String url){
		if(url!=null){
			try{
				if(csdnblogService.queryObjectByurl(url)==null){
					Integer type = 0;
					if(url.startsWith("http://blog.csdn.net")){
						type = 1;
					}else if(url.indexOf(".iteye.")!=-1){
						type =2;
					}else if(url.indexOf(".cnblogs.")!=-1){
						type = 3;
					}else if(url.startsWith("https://my.oschina.net")){
						type = 4;
					}
					Spider.create(new webmagicBlog(type)).addUrl(url)
							.addPipeline(new webmagicPipeline()) .run();
				}

			}catch (Exception e){
				e.printStackTrace();
			}
		}
		return "/csdnblog/csdnblogList.html";
	}
	
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	public R update(@RequestBody CsdnblogEntity csdnblog){
		csdnblogService.update(csdnblog);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@ResponseBody
	@RequestMapping("/delete")
	public R delete(@RequestBody Integer[] ids){
		csdnblogService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
