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
public class WpTermsEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long termId;
	//
	private String name;
	//
	private String slug;
	//
	private Long termGroup;

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
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}
	/**
	 * 获取：
	 */
	public String getSlug() {
		return slug;
	}
	/**
	 * 设置：
	 */
	public void setTermGroup(Long termGroup) {
		this.termGroup = termGroup;
	}
	/**
	 * 获取：
	 */
	public Long getTermGroup() {
		return termGroup;
	}
}
