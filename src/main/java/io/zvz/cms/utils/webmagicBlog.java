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
 * 爬取博客內容
 * Created by zvz on 2017/4/9.
 */
public class webmagicBlog implements PageProcessor {

    private Integer type;  // 來源網站  1 csdn  2 iteye 3 cnblogs 4 oschina

    private Site site = Site
            .me()
            .setSleepTime(3000)
            .setUserAgent(
                    "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_2) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31");


    public void process(Page page) {
        CsdnblogEntity csdnblogEntity  = new CsdnblogEntity();
        csdnblogEntity.setUrl(page.getUrl().toString());
        csdnblogEntity.setCreatDate(new Date());
        switch (type){
            case 1:
                csdnblogEntity.setAuthor(page.getHtml().xpath("//*[@id=\"blog_userface\"]/span/a/text()").toString());
                csdnblogEntity.setAuthorUrl(page.getHtml().xpath("//*[@id=\"blog_userface\"]/span/a/@href").toString());
                csdnblogEntity.setTitle(page.getHtml().xpath("//span[@class='link_title']/a/text()").toString());
                csdnblogEntity.setContext(page.getHtml().xpath("//*[@id=\"article_details\"]").toString());
                csdnblogEntity.setLabel(page.getHtml().xpath("//div[@class='article_l']/span/a/text()").all().toString());
                break;
            case 2:
                csdnblogEntity.setAuthor(page.getHtml().xpath("//*[@id=\"blog_owner_name\"]/text()").toString());
                csdnblogEntity.setAuthorUrl(page.getHtml().xpath("//*[@id=\"blog_owner_logo\"]/a/@href").toString());
                csdnblogEntity.setTitle(page.getHtml().xpath("//*[@id=\"main\"]/div[2]/div[1]/h3/a/text()").toString());
                csdnblogEntity.setContext(page.getHtml().xpath("//*[@id=\"blog_content\"]").toString());
                csdnblogEntity.setLabel(page.getHtml().xpath("//*[@id=\"main\"]/div[2]/div[1]/div/a/text()").all().toString());
                break;
            case 3:
                csdnblogEntity.setAuthor(page.getHtml().xpath("//*[@id=\"Header1_HeaderTitle\"]/text()").toString());
                csdnblogEntity.setAuthorUrl(page.getHtml().xpath("//*[@id=\"Header1_HeaderTitle\"]/@href").toString());
                csdnblogEntity.setTitle(page.getHtml().xpath("//*[@id=\"cb_post_title_url\"]/text()").toString());
                csdnblogEntity.setContext(page.getHtml().xpath("//*[@id=\"topics\"]/div/div[2]").toString());
                break;
            case 4:
                csdnblogEntity.setAuthor(page.getHtml().xpath("//div[@class='name']/a/text()").toString());
                csdnblogEntity.setAuthorUrl(page.getHtml().xpath("//div[@class='name']/a/@href").toString());
                csdnblogEntity.setTitle(page.getHtml().xpath("//div[@class='title']/text()").toString());
                csdnblogEntity.setContext(page.getHtml().xpath("//*[@id=\"blogBody\"]").toString());
                csdnblogEntity.setLabel(page.getHtml().xpath("//*[@id=\"classify\"]/a/text()").toString());
                csdnblogEntity.setLabel(page.getHtml().xpath("//*[@id=\"tag\"]/a/text()").all().toString()+csdnblogEntity.getLabel());
            default:
                break;
        }
        page.putField("csdnblogEntity",csdnblogEntity);
    }

    public Site getSite() {
        return site;
    }

    public webmagicBlog(Integer type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Spider.create(new webmagicBlog(1)).addUrl("http://blog.csdn.net/qinyuanpei/article/details/69787784")
                .addPipeline(new ConsolePipeline()) .run();
    }
}
