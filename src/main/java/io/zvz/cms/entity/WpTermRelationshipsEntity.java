package io.zvz.cms.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-27 22:30:19
 */
public class WpTermRelationshipsEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long objectId;
	//
	private Long termTaxonomyId;
	//
	private Integer termOrder;

	/**
	 * 设置：
	 */
	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}
	/**
	 * 获取：
	 */
	public Long getObjectId() {
		return objectId;
	}
	/**
	 * 设置：
	 */
	public void setTermTaxonomyId(Long termTaxonomyId) {
		this.termTaxonomyId = termTaxonomyId;
	}
	/**
	 * 获取：
	 */
	public Long getTermTaxonomyId() {
		return termTaxonomyId;
	}
	/**
	 * 设置：
	 */
	public void setTermOrder(Integer termOrder) {
		this.termOrder = termOrder;
	}
	/**
	 * 获取：
	 */
	public Integer getTermOrder() {
		return termOrder;
	}
}
