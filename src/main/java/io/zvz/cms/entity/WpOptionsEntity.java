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
public class WpOptionsEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long optionId;
	//
	private String optionName;
	//
	private String optionValue;
	//
	private String autoload;

	/**
	 * 设置：
	 */
	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}
	/**
	 * 获取：
	 */
	public Long getOptionId() {
		return optionId;
	}
	/**
	 * 设置：
	 */
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
	/**
	 * 获取：
	 */
	public String getOptionName() {
		return optionName;
	}
	/**
	 * 设置：
	 */
	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}
	/**
	 * 获取：
	 */
	public String getOptionValue() {
		return optionValue;
	}
	/**
	 * 设置：
	 */
	public void setAutoload(String autoload) {
		this.autoload = autoload;
	}
	/**
	 * 获取：
	 */
	public String getAutoload() {
		return autoload;
	}
}
