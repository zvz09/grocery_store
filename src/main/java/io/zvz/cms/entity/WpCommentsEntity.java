package io.zvz.cms.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-27 22:30:18
 */
public class WpCommentsEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long commentId;
	//
	private Long commentPostId;
	//
	private String commentAuthor;
	//
	private String commentAuthorEmail;
	//
	private String commentAuthorUrl;
	//
	private String commentAuthorIp;
	//
	private Date commentDate;
	//
	private Date commentDateGmt;
	//
	private String commentContent;
	//
	private Integer commentKarma;
	//
	private String commentApproved;
	//
	private String commentAgent;
	//
	private String commentType;
	//
	private Long commentParent;
	//
	private Long userId;

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
	public void setCommentPostId(Long commentPostId) {
		this.commentPostId = commentPostId;
	}
	/**
	 * 获取：
	 */
	public Long getCommentPostId() {
		return commentPostId;
	}
	/**
	 * 设置：
	 */
	public void setCommentAuthor(String commentAuthor) {
		this.commentAuthor = commentAuthor;
	}
	/**
	 * 获取：
	 */
	public String getCommentAuthor() {
		return commentAuthor;
	}
	/**
	 * 设置：
	 */
	public void setCommentAuthorEmail(String commentAuthorEmail) {
		this.commentAuthorEmail = commentAuthorEmail;
	}
	/**
	 * 获取：
	 */
	public String getCommentAuthorEmail() {
		return commentAuthorEmail;
	}
	/**
	 * 设置：
	 */
	public void setCommentAuthorUrl(String commentAuthorUrl) {
		this.commentAuthorUrl = commentAuthorUrl;
	}
	/**
	 * 获取：
	 */
	public String getCommentAuthorUrl() {
		return commentAuthorUrl;
	}
	/**
	 * 设置：
	 */
	public void setCommentAuthorIp(String commentAuthorIp) {
		this.commentAuthorIp = commentAuthorIp;
	}
	/**
	 * 获取：
	 */
	public String getCommentAuthorIp() {
		return commentAuthorIp;
	}
	/**
	 * 设置：
	 */
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	/**
	 * 获取：
	 */
	public Date getCommentDate() {
		return commentDate;
	}
	/**
	 * 设置：
	 */
	public void setCommentDateGmt(Date commentDateGmt) {
		this.commentDateGmt = commentDateGmt;
	}
	/**
	 * 获取：
	 */
	public Date getCommentDateGmt() {
		return commentDateGmt;
	}
	/**
	 * 设置：
	 */
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	/**
	 * 获取：
	 */
	public String getCommentContent() {
		return commentContent;
	}
	/**
	 * 设置：
	 */
	public void setCommentKarma(Integer commentKarma) {
		this.commentKarma = commentKarma;
	}
	/**
	 * 获取：
	 */
	public Integer getCommentKarma() {
		return commentKarma;
	}
	/**
	 * 设置：
	 */
	public void setCommentApproved(String commentApproved) {
		this.commentApproved = commentApproved;
	}
	/**
	 * 获取：
	 */
	public String getCommentApproved() {
		return commentApproved;
	}
	/**
	 * 设置：
	 */
	public void setCommentAgent(String commentAgent) {
		this.commentAgent = commentAgent;
	}
	/**
	 * 获取：
	 */
	public String getCommentAgent() {
		return commentAgent;
	}
	/**
	 * 设置：
	 */
	public void setCommentType(String commentType) {
		this.commentType = commentType;
	}
	/**
	 * 获取：
	 */
	public String getCommentType() {
		return commentType;
	}
	/**
	 * 设置：
	 */
	public void setCommentParent(Long commentParent) {
		this.commentParent = commentParent;
	}
	/**
	 * 获取：
	 */
	public Long getCommentParent() {
		return commentParent;
	}
	/**
	 * 设置：
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：
	 */
	public Long getUserId() {
		return userId;
	}
}
