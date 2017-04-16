package io.zvz.cms.utils;

import io.zvz.cms.entity.CsdnblogEntity;
import io.zvz.cms.entity.WpPostsEntity;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.Date;

/**
 * Created by zvz on 2017/4/9.
 */
public class CsdnBlog implements PageProcessor {

    private Site site = Site
            .me()
            .setSleepTime(3000)
            .setUserAgent(
                    "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_2) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31");


    public void process(Page page) {
        CsdnblogEntity csdnblogEntity  = new CsdnblogEntity();
        csdnblogEntity.setAuthor(page.getHtml().xpath("//*[@id=\"blog_userface\"]/span/a/text()").toString());
        csdnblogEntity.setAuthorUrl(page.getHtml().xpath("//*[@id=\"blog_userface\"]/span/a/@href").toString());
        csdnblogEntity.setUrl(page.getUrl().toString());
        csdnblogEntity.setTitle(page.getHtml().xpath("//span[@class='link_title']/a/text()").toString());
        csdnblogEntity.setContext(page.getHtml().xpath("//div[@class='markdown_views']").toString());
        csdnblogEntity.setLabel(page.getHtml().xpath("//div[@class='article_l']/span/a/text()").all().toString());
        csdnblogEntity.setCreatDate(new Date());

        page.putField("csdnblogEntity",csdnblogEntity);
    }

    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new CsdnBlog()).addUrl("http://blog.csdn.net/qinyuanpei/article/details/69787784")
                .addPipeline(new ConsolePipeline()) .run();
    }
}
