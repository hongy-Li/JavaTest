package com.lhy.bean;

import com.google.gson.JsonObject;

/**
 * 初步对Http请求返回数据进行解析
 * @author hebin
 *
 */
public class HttpResultInfoBean {

	public String ret = "-1";// 成功0，失败-1
	public String message = "";// 登陆信息
	public JsonObject body;
	@Override
	public String toString() {
		return "ResultInfoBean [ret=" + ret + ", message=" + message + ", body=" + body + "]";
	}

	// {"ret":-1,"message":"用户设备信息绑定失败  uid:2081","body":null}
	
	
}
