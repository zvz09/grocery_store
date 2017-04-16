package io.zvz.cms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import io.zvz.cms.entity.CsdnblogEntity;
import io.zvz.cms.service.CsdnblogService;
import io.zvz.cms.utils.CsdnBlog;
import io.zvz.cms.utils.CsdnPipeline;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
	public R list(Integer page, Integer limit){
		Map<String, Object> map = new HashMap<>();
		map.put("offset", (page - 1) * limit);
		map.put("limit", limit);

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
	@ResponseBody
	@RequestMapping("/save")
	public R save(String url){
		if(url!=null){
			try{
				if(csdnblogService.queryObjectByurl(url)==null){
					Spider.create(new CsdnBlog()).addUrl(url)
							.addPipeline(new CsdnPipeline()) .run();
				}
				return R.ok();
			}catch (Exception e){
				return R.error();
			}
		}else {
			return R.error();
		}

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
