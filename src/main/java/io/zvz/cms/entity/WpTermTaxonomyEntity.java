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
public class WpTermTaxonomyEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long termTaxonomyId;
	//
	private Long termId;
	//
	private String taxonomy;
	//
	private String description;
	//
	private Long parent;
	//
	private Long count;

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
	public void setTermId(Long termId) {
		this.termId = termId;
	}
	/**
	 * 获取：
	 */
	public Long getTermId() {
		return termId;
	}
	/**
	 * 设置：
	 */
	public void setTaxonomy(String taxonomy) {
		this.taxonomy = taxonomy;
	}
	/**
	 * 获取：
	 */
	public String getTaxonomy() {
		return taxonomy;
	}
	/**
	 * 设置：
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：
	 */
	public void setParent(Long parent) {
		this.parent = parent;
	}
	/**
	 * 获取：
	 */
	public Long getParent() {
		return parent;
	}
	/**
	 * 设置：
	 */
	public void setCount(Long count) {
		this.count = count;
	}
	/**
	 * 获取：
	 */
	public Long getCount() {
		return count;
	}
}
