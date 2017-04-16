package io.zvz.cms.service;

import io.zvz.cms.entity.WpPostsEntity;

/**
 * Created by zvz on 2017/3/29.
 */
public interface WpPostsService {

    /**
     * 保存文章
     */
    void save(WpPostsEntity wpPostsEntity);

}
