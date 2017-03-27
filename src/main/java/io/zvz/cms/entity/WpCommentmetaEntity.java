package io.zvz.cms.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-27 22:33:59
 */
public class WpCommentmetaEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long metaId;
	//
	private Long commentId;
	//
	private String metaKey;
	//
	private String metaValue;

	/**
	 * 设置：
	 */
	public void setMetaId(Long metaId) {
		this.metaId = metaId;
	}
	/**
	 * 获取：
	 */
	public Long getMetaId() {
		return metaId;
	}
	/**
	 * 设置：
	 */
	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}
	/**
	 * 获取：
	 */
	public Long getCommentId() {
		return commentId;
	}
	/**
	 * 设置：
	 */
	public void setMetaKey(String metaKey) {
		this.metaKey = metaKey;
	}
	/**
	 * 获取：
	 */
	public String getMetaKey() {
		return metaKey;
	}
	/**
	 * 设置：
	 */
	public void setMetaValue(String metaValue) {
		this.metaValue = metaValue;
	}
	/**
	 * 获取：
	 */
	public String getMetaValue() {
		return metaValue;
	}
}
