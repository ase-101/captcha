package io.mosip.captcha.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CaptchaRequestDTO implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String captchaToken;
	private String moduleName;
}
