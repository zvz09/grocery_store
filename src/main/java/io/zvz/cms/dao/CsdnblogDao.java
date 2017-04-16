package io.zvz.cms.dao;

import io.renren.dao.BaseDao;
import io.zvz.cms.entity.CsdnblogEntity;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-04-16 16:28:53
 */
public interface CsdnblogDao extends BaseDao<CsdnblogEntity> {
	    CsdnblogEntity queryObjectByurl(String utl);
}
