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
public class WpLinksEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long linkId;
	//
	private String linkUrl;
	//
	private String linkName;
	//
	private String linkImage;
	//
	private String linkTarget;
	//
	private String linkDescription;
	//
	private String linkVisible;
	//
	private Long linkOwner;
	//
	private Integer linkRating;
	//
	private Date linkUpdated;
	//
	private String linkRel;
	//
	private String linkNotes;
	//
	private String linkRss;

	/**
	 * 设置：
	 */
	public void setLinkId(Long linkId) {
		this.linkId = linkId;
	}
	/**
	 * 获取：
	 */
	public Long getLinkId() {
		return linkId;
	}
	/**
	 * 设置：
	 */
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	/**
	 * 获取：
	 */
	public String getLinkUrl() {
		return linkUrl;
	}
	/**
	 * 设置：
	 */
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}
	/**
	 * 获取：
	 */
	public String getLinkName() {
		return linkName;
	}
	/**
	 * 设置：
	 */
	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}
	/**
	 * 获取：
	 */
	public String getLinkImage() {
		return linkImage;
	}
	/**
	 * 设置：
	 */
	public void setLinkTarget(String linkTarget) {
		this.linkTarget = linkTarget;
	}
	/**
	 * 获取：
	 */
	public String getLinkTarget() {
		return linkTarget;
	}
	/**
	 * 设置：
	 */
	public void setLinkDescription(String linkDescription) {
		this.linkDescription = linkDescription;
	}
	/**
	 * 获取：
	 */
	public String getLinkDescription() {
		return linkDescription;
	}
	/**
	 * 设置：
	 */
	public void setLinkVisible(String linkVisible) {
		this.linkVisible = linkVisible;
	}
	/**
	 * 获取：
	 */
	public String getLinkVisible() {
		return linkVisible;
	}
	/**
	 * 设置：
	 */
	public void setLinkOwner(Long linkOwner) {
		this.linkOwner = linkOwner;
	}
	/**
	 * 获取：
	 */
	public Long getLinkOwner() {
		return linkOwner;
	}
	/**
	 * 设置：
	 */
	public void setLinkRating(Integer linkRating) {
		this.linkRating = linkRating;
	}
	/**
	 * 获取：
	 */
	public Integer getLinkRating() {
		return linkRating;
	}
	/**
	 * 设置：
	 */
	public void setLinkUpdated(Date linkUpdated) {
		this.linkUpdated = linkUpdated;
	}
	/**
	 * 获取：
	 */
	public Date getLinkUpdated() {
		return linkUpdated;
	}
	/**
	 * 设置：
	 */
	public void setLinkRel(String linkRel) {
		this.linkRel = linkRel;
	}
	/**
	 * 获取：
	 */
	public String getLinkRel() {
		return linkRel;
	}
	/**
	 * 设置：
	 */
	public void setLinkNotes(String linkNotes) {
		this.linkNotes = linkNotes;
	}
	/**
	 * 获取：
	 */
	public String getLinkNotes() {
		return linkNotes;
	}
	/**
	 * 设置：
	 */
	public void setLinkRss(String linkRss) {
		this.linkRss = linkRss;
	}
	/**
	 * 获取：
	 */
	public String getLinkRss() {
		return linkRss;
	}
}
