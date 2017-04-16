package io.zvz.cms.controller;

import io.renren.utils.R;
import io.zvz.cms.entity.WpPostsEntity;
import io.zvz.cms.service.WpPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zvz on 2017/3/29.
 */
@RestController
@RequestMapping("/cms/posts")
public class WppostsController {

    @Autowired
    private WpPostsService wpPostsService;

    @RequestMapping("/save")
    /*@RequiresPermissions("sys:user:save")*/
    public R save(@RequestBody WpPostsEntity posts){
        wpPostsService.save(posts);
        return R.ok();
    }
}
