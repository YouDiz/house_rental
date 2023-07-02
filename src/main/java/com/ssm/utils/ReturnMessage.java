package com.ssm.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 */
public class ReturnMessage extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	
	public ReturnMessage() {
		put("code", 0);
	}
	
	public static ReturnMessage error() {
		return error(500, "未知异常，请联系管理员");
	}
	
	public static ReturnMessage error(String msg) {
		return error(500, msg);
	}
	
	public static ReturnMessage error(int code, String msg) {
		ReturnMessage returnMessage = new ReturnMessage();
		returnMessage.put("code", code);
		returnMessage.put("msg", msg);
		return returnMessage;
	}

	public static ReturnMessage ok(String msg) {
		ReturnMessage returnMessage = new ReturnMessage();
		returnMessage.put("msg", msg);
		return returnMessage;
	}
	
	public static ReturnMessage ok(Map<String, Object> map) {
		ReturnMessage returnMessage = new ReturnMessage();
		returnMessage.putAll(map);
		return returnMessage;
	}
	
	public static ReturnMessage ok() {
		return new ReturnMessage();
	}

	public ReturnMessage put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
