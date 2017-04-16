package io.zvz.cms.service.impl;

import io.zvz.cms.dao.WpPostsDao;
import io.zvz.cms.entity.WpPostsEntity;
import io.zvz.cms.service.WpPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by zvz on 2017/3/29.
 */


@Service("wpPostsService")
public class WpPostsServiceImpl implements WpPostsService {

    @Autowired
    private WpPostsDao wpPostsDao;

    @Override
    @Transactional
    public void save(WpPostsEntity wpPostsEntity) {
        wpPostsEntity.setPostDate(new Date());
        wpPostsDao.save(wpPostsEntity);
    }
}
