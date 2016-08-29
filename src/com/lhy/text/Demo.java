package com.lhy.text;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lhy.bean.DoorInfoBean;
import com.lhy.bean.HttpResultInfoBean;
import com.lhy.bean.UdpMessageBean;
import com.lhy.bean.Utils;
import com.lhy.thread.ThreadDemo;


public class Demo {

	@Test
	public void test38(){
//		JSONObject json=new JSONObject();
//		json.put("key", null);
		
//		System.out.println(json.get("hah"));
		
		
	}
	
	@Test
	public void test37(){
		String str=new String("abc");
		SoftReference<String> soft=new SoftReference<String>(str);
		WeakReference< String> weak=new WeakReference<String>(str);
		str=null;
//		soft.clear();
		System.out.println("soft is "+soft.get());
		
		System.gc();
//		try {
//			Thread.sleep(2000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		System.out.println("soft is "+soft.get());
		System.out.println("weak is "+weak.get());
		
	}
	@Test
	public void test36() {
		String referent = "hahah";
		WeakReference<String> weak = new WeakReference<String>(referent);

		String str = weak.get();
//		try {
//			Thread.sleep(4000);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		System.out.println(str);
		referent=null;
		str=weak.get();
		System.out.println(referent);
		System.out.println(str);
	}

	@Test
	public void test35() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				int i = ThreadDemo.requestToServer();
				System.out.println("i is " + i);
			}
		}).start();
	}

	@Test
	public void test34() {
		// int t=0;
		// int x=0;
		// int y=0;
		// t=(x=6,y=5,x+y);
	}

	@Test
	public void test33() {
		DoorInfoBean bean1 = new DoorInfoBean();
		DoorInfoBean bean2 = new DoorInfoBean();

		System.out.println("bean1 is " + bean1.hashCode());
		System.out.println("bean2 is " + bean2.hashCode());
	}

	@Test
	public void test32() {
		long a = 1452757038051l;
		long b = 1452757038030l;
		int c = (int) (b - a);
		System.out.println("c is " + c);
	}

	@Test
	public void test31() {
		List<String> list = new ArrayList<>();
		list.clear();
		System.out.println("hah");

	}

	@Test
	public void test30() {
		List<DoorInfoBean> bean = new ArrayList<>();
		bean.add(new DoorInfoBean());
		bean.add(new DoorInfoBean());
		System.out.println(bean.toString());
		for (int i = 0; i < bean.size(); i++) {
			bean.get(i).danyuanId = "123";
		}
		System.out.println(bean.toString());
	}

	@Test
	public void test29() {
		List<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		System.out.println("list1 is " + list1.toString());
		List<String> list2 = new ArrayList<String>();
		list2.add("3");
		list2.add("4");
		System.out.println("list2 is " + list2.toString());

		list1.addAll(list2);
		System.out.println("list1 is " + list1.toString());

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		String json = new Gson().toJson(list1);
		System.out.println("json is " + json.toString());
	}

	@Test
	public void test28() {
		// String str="{ \"body\": { \"pwdList\": [ \"298933\", \"110078\",
		// \"202048\", \"954593\", \"758128\" ] }, \"message\": \"操作成功\",
		// \"ret\": 0}";
		String str = "{    \"body\": {    \"area\":30.155,     \"requestTimestamp\":\"1452162303471\",        \"userList\": [            \"10060\",            \"10061\"        ]    },    \"message\": \"发送给用户推送成功\",    \"ret\": 0}";
		Gson gson = new Gson();
		HttpResultInfoBean bean = new HttpResultInfoBean();
		bean = gson.fromJson(str, HttpResultInfoBean.class);
		try {
			JsonObject json = bean.body;
			System.out.println("json is " + json);
			JsonElement elementList = json.get("userLis");
			System.out.println("element is " + elementList);
			String elementListString = json.get("userList").getAsString();
			System.err.println("elementListString is " + elementListString);
			JsonElement elementFloat = json.get("area");
			System.out.println("elementFloat is " + elementFloat.toString());
			JsonElement elementString = json.get("requestTimestamp");
			System.out.println("elementString.toString() is " + elementString.toString());
			String elementStringStr = json.get("requestTimestamp").getAsString();
			// boolean b=json.get("hah").isJsonNull();

			System.out.println("elementList.toString() is " + elementList.toString());

			System.out.println("elementStringStr.toString() is " + elementStringStr);
		} catch (Exception e) {
			System.out.println("e.getMessage() is " + e.getMessage());

			// TODO: handle exception
		}
	}

	@Test
	public void test27() {
		/* 时间戳转换成字符窜 */
		// 1451524569026
		long b = 1451482785817l;
		long a = System.currentTimeMillis();
		Date d = new Date(a);
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd hh:mm:ss");
		System.out.println(sf.format(b));
	}

	@Test
	public void test26() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				Utils.method1(1, 2, 4);
			}

		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				Utils.method1(5, 6, 4);
			}

		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				Utils.method1(7, 8, 9);
			}

		}).start();
	}

	long a;

	@Test
	public void test25() {
		String aa = String.valueOf(a);
		System.out.println(aa);
		a = System.currentTimeMillis();
		System.out.println(String.valueOf(a));

		// String str=null;
		// System.out.println(str.toString());

	}

	@Test
	public void test24() {
		// String
		// msg="{\"ACTION\":\"OPEN\",\"EXT\":\"\",\"HIS\":\"0\",\"REQUESTTIMESTAMP\":\"\",\"SEQ\":\"5054\",\"UID\":\"admin\"}";
		String msg = "{\"ACTION\":\"OPEN\",\"EXT\":{},\"HIS\":\"0\",\"REQUESTTIMESTAMP\":\"\",\"SEQ\":\"5054\",\"UID\":\"admin\"}";
		UdpMessageBean yijiaPushBean = null;
		try {
			yijiaPushBean = new Gson().fromJson(msg, UdpMessageBean.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.err.println(yijiaPushBean.toString());
	}

	public void test23() {
		String str = null;
		try {
			str.equals("haha");
		} catch (Exception e) {
			System.out.println("yichang");
			return;
		}
		System.out.println("hah");
	}

	public static void test22() {
		String str = "{\"xiaoquName\":\"宜家安好小区\",\"danyuanNum\":\"1\",\"louNum\":\"1\",\"xiaoquId\":34,\"danyuanId\":208,\"doorWifiPassword\":\"\",\"neteasePassword\":\"www.ikeawell.com\",\"did\":\"2089\",\"louId\":55,\"doorName\":\"lou_1_danyuan_1\",\"doorBtLowName\":\"l_1_d_1\",\"doorBtName\":\"\",\"objId\":\"d00002089\",\"housePwd\":[{\"houseId\":15854,\"houseNum\":\"1001\",\"pwd\":\"349726\"},{\"houseId\":15855,\"houseNum\":\"1002\",\"pwd\":\"143934\"},{\"houseId\":15856,\"houseNum\":\"1003\",\"pwd\":\"726846\"},{\"houseId\":15857,\"houseNum\":\"1004\",\"pwd\":\"177912\"},{\"houseId\":15858,\"houseNum\":\"1005\",\"pwd\":\"408080\"},{\"houseId\":15859,\"houseNum\":\"2001\",\"pwd\":\"361333\"},{\"houseId\":15860,\"houseNum\":\"2002\",\"pwd\":\"689779\"},{\"houseId\":15861,\"houseNum\":\"2003\",\"pwd\":\"785537\"},{\"houseId\":15862,\"houseNum\":\"2004\",\"pwd\":\"269710\"},{\"houseId\":15863,\"houseNum\":\"2005\",\"pwd\":\"645335\"},{\"houseId\":15864,\"houseNum\":\"3001\",\"pwd\":\"946561\"},{\"houseId\":15865,\"houseNum\":\"3002\",\"pwd\":\"708357\"},{\"houseId\":15866,\"houseNum\":\"3003\",\"pwd\":\"479980\"},{\"houseId\":15867,\"houseNum\":\"3004\",\"pwd\":\"847024\"},{\"houseId\":15868,\"houseNum\":\"3005\",\"pwd\":\"404372\"},{\"houseId\":15869,\"houseNum\":\"4001\",\"pwd\":\"669751\"},{\"houseId\":15870,\"houseNum\":\"4002\",\"pwd\":\"177929\"},{\"houseId\":15871,\"houseNum\":\"4003\",\"pwd\":\"053638\"},{\"houseId\":15872,\"houseNum\":\"4004\",\"pwd\":\"394940\"},{\"houseId\":15873,\"houseNum\":\"4005\",\"pwd\":\"418985\"},{\"houseId\":15874,\"houseNum\":\"5001\",\"pwd\":\"882775\"},{\"houseId\":15875,\"houseNum\":\"5002\",\"pwd\":\"799809\"},{\"houseId\":15876,\"houseNum\":\"5003\",\"pwd\":\"458500\"},{\"houseId\":15877,\"houseNum\":\"5004\",\"pwd\":\"217114\"},{\"houseId\":15878,\"houseNum\":\"5005\",\"pwd\":\"877577\"},{\"houseId\":15879,\"houseNum\":\"6001\",\"pwd\":\"606536\"},{\"houseId\":15880,\"houseNum\":\"6002\",\"pwd\":\"568596\"},{\"houseId\":15881,\"houseNum\":\"6003\",\"pwd\":\"169645\"},{\"houseId\":15882,\"houseNum\":\"6004\",\"pwd\":\"217250\"},{\"houseId\":15883,\"houseNum\":\"6005\",\"pwd\":\"072541\"},{\"houseId\":15884,\"houseNum\":\"7001\",\"pwd\":\"334335\"},{\"houseId\":15885,\"houseNum\":\"7002\",\"pwd\":\"213315\"},{\"houseId\":15886,\"houseNum\":\"7003\",\"pwd\":\"811208\"},{\"houseId\":15887,\"houseNum\":\"7004\",\"pwd\":\"324758\"},{\"houseId\":15888,\"houseNum\":\"7005\",\"pwd\":\"906161\"},{\"houseId\":15889,\"houseNum\":\"8001\",\"pwd\":\"547228\"},{\"houseId\":15890,\"houseNum\":\"8002\",\"pwd\":\"408360\"},{\"houseId\":15891,\"houseNum\":\"8003\",\"pwd\":\"102576\"},{\"houseId\":15892,\"houseNum\":\"8004\",\"pwd\":\"522385\"},{\"houseId\":15893,\"houseNum\":\"8005\",\"pwd\":\"735733\"},{\"houseId\":15894,\"houseNum\":\"9001\",\"pwd\":\"737574\"},{\"houseId\":15895,\"houseNum\":\"9002\",\"pwd\":\"662128\"},{\"houseId\":15896,\"houseNum\":\"9003\",\"pwd\":\"399001\"},{\"houseId\":15897,\"houseNum\":\"9004\",\"pwd\":\"797564\"},{\"houseId\":15898,\"houseNum\":\"9005\",\"pwd\":\"745973\"},{\"houseId\":15899,\"houseNum\":\"10001\",\"pwd\":\"168860\"},{\"houseId\":15900,\"houseNum\":\"10002\",\"pwd\":\"994437\"},{\"houseId\":15901,\"houseNum\":\"10003\",\"pwd\":\"863400\"},{\"houseId\":15902,\"houseNum\":\"10004\",\"pwd\":\"611431\"},{\"houseId\":15903,\"houseNum\":\"10005\",\"pwd\":\"643165\"}]}";
		DoorInfoBean doorInfoBean = null;
		doorInfoBean = new Gson().fromJson(str, DoorInfoBean.class);

		String str1 = doorInfoBean.valiatePwdOpenDoor("399001");
		System.out.println(str1);
	}

	// public static void test(){
	// String
	// str="{\"message\":\"操作成功\",\"ret\":0,\"body\":{\"house\":[{\"state\":0,\"newOpenPassword\":\"\",\"openPassword\":\"553220\",\"houseId\":27630},{\"state\":0,\"newOpenPassword\":\"\",\"openPassword\":\"508015\",\"houseId\":27560},{\"state\":0,\"newOpenPassword\":\"\",\"openPassword\":\"800301\",\"houseId\":27551},{\"state\":0,\"newOpenPassword\":\"\",\"openPassword\":\"119106\",\"houseId\":28247},{\"state\":0,\"newOpenPassword\":\"\",\"openPassword\":\"455377\",\"houseId\":27571}]}}";
	// try {
	// JSONObject json=new JSONObject(str);
	// String ret=json.getString("ret");
	// System.out.println("ret is "+ret);
	//
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }

	@Test
	public void test21() {
		String str = "{\"message\":\"操作成功\",\"ret\":0,\"body\":{\"house\":[{\"state\":0,\"newOpenPassword\":\"\",\"openPassword\":\"553220\",\"houseId\":27630},{\"state\":0,\"newOpenPassword\":\"\",\"openPassword\":\"508015\",\"houseId\":27560},{\"state\":0,\"newOpenPassword\":\"\",\"openPassword\":\"800301\",\"houseId\":27551},{\"state\":0,\"newOpenPassword\":\"\",\"openPassword\":\"119106\",\"houseId\":28247},{\"state\":0,\"newOpenPassword\":\"\",\"openPassword\":\"455377\",\"houseId\":27571}]}}";

		// JSONObject bodyMsg = new JSONObject(str);
		// JsonObject j=new Gson().fo;

	}

	@Test
	public void test20() {
		Random random = new Random();
		int i = random.nextInt(100);
		System.out.println(i);
	}

	@Test
	public void test19() {
		int test = 0;
		int i = 0;
		if (i < 5) {
			System.out.println("i is " + i);
		}
		switch (i) {
		case 0:
			System.out.println("switch i is " + i);
		case 1:
			test = 1;
		case 2:
			test = 2;
			System.out.println("test is " + test);
			break;
		}
	}

	@Test
	public void test18() {
		int options = 100;
		System.out.println("options is " + options);
		options -= 20;
		System.out.println("options is " + options);
	}

	@Test
	public void test17() {
		String a1 = "1449719156728";
		String a2 = "1449719157322";

		long differ = Long.parseLong(a2) - Long.parseLong(a1);
		System.out.println(differ);
	}

	@Test
	public void test16() {
		List<String> list = new ArrayList<String>();
		list.add("li");
		list.add("wang");
		list.add("zhang");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			if (i == 2) {
				list.remove("li");
				System.out.println(list.toString());
				list.add("li");
				System.out.println(list.toString());
			}
		}
	}

	@Test
	public void test15() {
		String str = "1234/jjj.jpg";
		try {
			MessageDigest instance = MessageDigest.getInstance("MD5");// 获取MD5算法对象
			byte[] digest = instance.digest(str.getBytes());// 对字符串加密,返回字节数组

			StringBuffer sb = new StringBuffer();
			for (byte b : digest) {
				int i = b & 0xff;// 获取字节的低八位有效值
				String hexString = Integer.toHexString(i);// 将整数转为16进制

				if (hexString.length() < 2) {
					hexString = "0" + hexString;// 如果是1位的话,补0
				}

				sb.append(hexString);
			}

			System.out.println(sb.toString());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test12() {
		String str = "1,2,4,5";
		boolean bool = str.contains("1");
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		System.out.println(list.toString());
		String temp = list.toString();
		System.out.println(temp);
	}

	@Test
	public void test13() {
		String password = "12345";
		try {
			MessageDigest instance = MessageDigest.getInstance("MD5");// 获取MD5算法对象
			byte[] digest = instance.digest(password.getBytes());// 对字符串加密,返回字节数组

			StringBuffer sb = new StringBuffer();
			for (byte b : digest) {
				int i = b & 0xff;// 获取字节的低八位有效值
				String hexString = Integer.toHexString(i);// 将整数转为16进制

				if (hexString.length() < 2) {
					hexString = "0" + hexString;// 如果是1位的话,补0
				}

				sb.append(hexString);
			}
			System.out.println(sb);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			// 没有该算法时,抛出异常, 不会走到这里
		}
	}

	@Test
	public void test14() {
		for (int i = 0; i < 100; i++) {
			System.out.println("haha " + i);
			if (i > 50) {
				System.out.println("less than 50");
				break;
			}
			System.out.println(i);
		}
	}
}
