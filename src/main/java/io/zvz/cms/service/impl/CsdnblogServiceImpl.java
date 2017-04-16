package io.zvz.cms.service.impl;

import io.zvz.cms.dao.CsdnblogDao;
import io.zvz.cms.entity.CsdnblogEntity;
import io.zvz.cms.service.CsdnblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;




@Service("csdnblogService")
public class CsdnblogServiceImpl implements CsdnblogService {
	@Autowired
	private CsdnblogDao csdnblogDao;
	
	@Override
	public CsdnblogEntity queryObject(Integer id){
		return csdnblogDao.queryObject(id);
	}
	
	@Override
	public List<CsdnblogEntity> queryList(Map<String, Object> map){
		return csdnblogDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return csdnblogDao.queryTotal(map);
	}
	
	@Override
	public void save(CsdnblogEntity csdnblog){
		csdnblogDao.save(csdnblog);
	}
	
	@Override
	public void update(CsdnblogEntity csdnblog){
		csdnblogDao.update(csdnblog);
	}
	
	@Override
	public void delete(Integer id){
		csdnblogDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		csdnblogDao.deleteBatch(ids);
	}

	@Override
	public CsdnblogEntity queryObjectByurl(String utl) {
		return csdnblogDao.queryObjectByurl(utl);
	}

}
