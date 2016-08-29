package com.lhy.bean;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * 门禁进本信息+密码开门账户信息
 */
public class DoorInfoBean {

	public String did = "";// 门禁id
	public String objId = "";// 门禁推送账号,视频账户
	public String xiaoquId = "";// 小区id
	public String xiaoquName = "";// 小区名称
	public String louId = "";// 楼id
	public String louNum = "";// 楼号
	public String danyuanId = "";// 单元id
	public String danyuanNum = "";// 单元号
	public String doorName = "";// 门禁名称
	public String doorWifiPassword = "";// 门禁WIFI密码
	public String doorBtName = "";// 非低功耗蓝牙名称
	public String doorBtLowName = "";// 低功耗蓝牙名称
	public JsonArray housePwd;//key:uid，value：密码
	@Override
	public String toString() {
		return "DoorInfoBean [did=" + did + ", objId=" + objId + ", xiaoquId=" + xiaoquId + ", xiaoquName=" + xiaoquName
				+ ", louId=" + louId + ", louNum=" + louNum + ", danyuanId=" + danyuanId + ", danyuanNum=" + danyuanNum
				+ ", doorName=" + doorName + ", doorWifiPassword=" + doorWifiPassword + ", doorBtName=" + doorBtName
				+ ", doorBtLowName=" + doorBtLowName + ", housePwd=" + housePwd + "]";
	}
	/**
	 * 账号和id是否合法(门禁密码开门专用，远程开门不需要验证密码)
	 * @param uid
	 * @param pwd
	 * @return
	 */
	public String valiatePwdOpenDoor(String pwd){
		String house = "";
		JsonObject object =null;
		for(int i=0;i<housePwd.size();i++){
			object = housePwd.get(i).getAsJsonObject();
			if(pwd.equals(object.get("pwd").getAsString())){
				//TODO 记录所在房屋
				house=object.get("houseNum").getAsString();
			}
		}
		return house;	
	}
	
	
}
