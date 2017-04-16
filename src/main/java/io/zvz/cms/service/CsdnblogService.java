package io.zvz.cms.service;


import io.zvz.cms.entity.CsdnblogEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-04-16 16:28:53
 */
public interface CsdnblogService {
	
	CsdnblogEntity queryObject(Integer id);
	
	List<CsdnblogEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(CsdnblogEntity csdnblog);
	
	void update(CsdnblogEntity csdnblog);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);

	CsdnblogEntity queryObjectByurl(String utl);
}
