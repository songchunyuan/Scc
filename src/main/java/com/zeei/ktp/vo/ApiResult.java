package com.zeei.ktp.vo;

public class ApiResult<T> {
	/**
	 * 是否成功 成功为true,失败为false
	 */
	private Boolean success;
	/**
	 * 返回编码
	 */
	private Integer code;
	/**
	 * 返回信息
	 */
	private String codeMessage;
	/**
	 * 返回数据
	 */
	private T data;

	public ApiResult() {
	}

	/**
	 * 如果失败或者没有返回数据,则使用此构造方法
	 * @param success
	 * @param code
	 * @param codeMessage
	 */
	public ApiResult(Boolean success, Integer code, String codeMessage) {
		this.success = success;
		this.code = code;
		this.codeMessage = codeMessage;
	}

	/**
	 * 适合成功时调用
	 * @param success
	 * @param code
	 * @param codeMessage
	 * @param data
	 */
	public ApiResult(Boolean success, Integer code, String codeMessage, T data) {
		this.success = success;
		this.code = code;
		this.codeMessage = codeMessage;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCodeMessage() {
		return codeMessage;
	}

	public void setCodeMessage(String codeMessage) {
		this.codeMessage = codeMessage;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
