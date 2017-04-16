package io.zvz.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zvz on 2017/3/28.
 * cms系统页面视图
 */
@Controller
public class CmsPageController {

    @RequestMapping("cms/{url}.html")
    public String page(@PathVariable("url") String url){
        return "cms/" + url + ".html";
    }
}
