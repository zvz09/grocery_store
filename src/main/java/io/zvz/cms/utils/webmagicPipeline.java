package io.zvz.cms.utils;

import io.renren.utils.SpringContextUtils;
import io.zvz.cms.dao.CsdnblogDao;
import io.zvz.cms.entity.CsdnblogEntity;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

/**
 * 保存爬取信息
 * Created by zvz on 2017/4/16.
 */
public class webmagicPipeline implements Pipeline {

    private CsdnblogDao csdnblogDao;
    @Override
    public void process(ResultItems resultItems, Task task) {
        csdnblogDao = (CsdnblogDao)SpringContextUtils.getBean("csdnblogDao");
        CsdnblogEntity csdnblogEntity = (CsdnblogEntity)resultItems.get("csdnblogEntity");
        csdnblogDao.save(csdnblogEntity);
    }
}
