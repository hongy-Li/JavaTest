package com.lhy.bean;

import com.google.gson.JsonObject;

public class UdpMessageBean {

	public String ACTION;
	public JsonObject EXT;
	@Override
	public String toString() {
		return "YijiaPushBean [ACTION=" + ACTION + ", EXT=" + EXT + "]";
	}
}
