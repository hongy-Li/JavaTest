package com.lhy.text;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import org.junit.Test;

import com.google.gson.Gson;
import com.lhy.bean.HttpResultInfoBean;

public class GsonDemo {

	// static String a="a";
	// static{
	// System.out.println(a);
	// }

//	public static void main(String[] args) {
//
////		String data="{  \"HIS\": \"0\",   \"SEQ\": \"885\",    \"S_DESCRIPTION\": \"2号楼1单元门禁呼叫\",    \"S_TITLE\": \"一家安好通知\",    \"actionId\": \"1001\",    \"did\": \"2110\",    \"houseNum\": \"1001\",    \"imgId\": \"yijia/2110_20151202204225.jpg\",    \"requestTimestamp\": \"1449060147217\"}";
////		Map<String,String> map = JSON.parseObject(data,HashMap.class);
//		
//		test6();
////		Map map=new HashMap<>();
////		map.put("n", "n");
////		System.out.println("map.get"+map.get("y"));
////		
////		switch ("") {
////		case "11":
////			System.out.println("nihao");
////			break;
////
////		default:
////			System.out.println("haha");
////			break;
////		}
////		
////		
////		 String abc = "aaabb/bccc";
//////		    String[] arr = abc.split(",");
////		    List<String> list = java.util.Arrays.asList(abc);
////		    System.out.println( list.get(0));
//		
//		
//		// StaticTest t1=null;
//		// t1=new StaticTest();
//		// StaticTest.get();
//		// StaticTest.get1();
//
//		// test1();
//		// test2();
//		// test4();
//		// test5();
//		// test6();
//		// test7();
//		// test8();
////		test9();
////		test12();
//		// String str="1001";
//		// if(str.startsWith("1")){
//		// System.out.println("true");
//		// }
//		//
//		// String str1="1.2.3";
//		// String [] arr=str1.split(".");
//		// System.out.println(arr[1]);
//		// TextBean<String> t1=new TextBean<>("1","2",null);
//		// Gson g=new Gson();
//		// String str=g.toJson(t1);
//		//
//		//
//		// System.out.println(str);
//		//
//		//
//		// TextBean<String> t2 =g.fromJson(str, new
//		// TypeToken<TextBean<String>>() {}.getType());
//		// System.out.println("t2 is "+ t2);
//		//
//		//
//		// String str2=g.toJson(t2);
//		// System.out.println("str2 is "+ str2);
//		//
//		//
//		// TextBean<String> t3=new TextBean<>("3","4",str2);
//		// String str3=g.toJson(t3);
//		// System.out.println("str3 is "+ str3);
//		//
//		// //
//		// str3="{\"ret\":0,\"message\":\"�Ž��½�ɹ�\",\"body\":{\"did\":562,\"token\":\"f828c2aa56f24e469f82f7f8b46978b1\"}}";
//		// TextBean<String> t4 =g.fromJson(str3, new
//		// TypeToken<TextBean<String>>() {}.getType());
//		// String str4=g.toJson(t4);
//		// System.out.println("str4 is "+ str4);
//
//		// TextBean<String> t4=g.fromJson(str, TextBean.class);
//		// System.out.println(t3.body.toString()+t3.message);
//		//
//		// TextBean<String> t4=g.fromJson(t3.body, new
//		// TypeToken<TextBean<String>>() {}.getType());
//		// System.out.println("t4.body is "+t4.body);
//	}

	private static void test9() {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				System.out.println("定时器");
			}
		};
		timer.schedule(task, 5000);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		timer.cancel();
	}

	private static void test8() {
		String str = "{\"ret\":0,\"message\":\"操作成功\",\"body\":{}}";
		Gson gson = new Gson();
		HttpResultInfoBean bean = gson.fromJson(str, HttpResultInfoBean.class);

		bean.body.isJsonNull();
		bean.body.isJsonObject();
		bean.body.getAsJsonObject().isJsonNull();
		bean.body.isJsonPrimitive();
		bean.body.toString().equals("{}");

		System.out.println("bean is " + bean.toString());
	}

	private static void test7() {

		// long current1=System.currentTimeMillis();
		// System.out.println(""+current1);
		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		long current2 = System.currentTimeMillis();
		System.out.println("" + current2);
		long differ = current2 - Long.parseLong("1447290888964");
		System.out.println("differ is " + differ / 1000);
	}

	private static void test6() {
		long a = 1234556666;
				String aa="1449124930454";
			a=Long.parseLong(aa)	;
		long b = 0L;
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
		String s1 = sf.format(a);
		String s2 = sf.format(b);

		System.out.println(s1);
	}

	public static void test4() {
		long time = System.currentTimeMillis();
		System.out.println("time is " + time);

		// 12小时制
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddhhmmss");
		String str1 = sf.format(d);
		System.out.println("str1 is " + str1 + " d is " + d.toString());
		// 24小时制

		SimpleDateFormat sf24 = new SimpleDateFormat("yyyyMMddHHmmss");
		String str24 = sf24.format(System.currentTimeMillis());
		System.out.println("srr24 is" + str24);

		Date d1 = new Date(Long.parseLong("1447130089846"));
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyyMMddHHmmss");
		String str2 = sf.format(d1);
		System.out.println("str1 is " + str2 + " d1 is " + d1);

		SimpleDateFormat sf2 = new SimpleDateFormat("yyyyMMddhhmmss");

	}

	public static void test5() {
		Calendar cal = Calendar.getInstance();// 当前日期
		cal.getTimeInMillis();
		String time = cal.getTime().toString();

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;// 获取月份
		int day = cal.get(Calendar.DAY_OF_MONTH);// 获取日
		int hour = cal.get(Calendar.HOUR_OF_DAY);// 获取小时
		int minute = cal.get(Calendar.MINUTE);// 获取分钟
		int minuteOfDay = hour * 60 + minute;// 当前时间的分钟数
		final int start = 12 * 60 + 20;// 区间开始的分钟数
		final int end = 13 * 60;// 区间结束的分钟数
		if (minuteOfDay >= start && minuteOfDay <= end) {
			System.out.println("在内");
		} else {
			System.out.println("在外围外");
		}
	}

	public static void test3() {
		Map<String, String> extMap = new HashMap<String, String>();
		extMap.put("actionId", "1001");
		extMap.put("did", "202");
		extMap.put("imgId", "2081_20151106144800.jpg");

	}

	public static void test1() {
		String objectkey = "yijia/2081_20151106144800.jpg";

		int index = objectkey.lastIndexOf("/");
		String name = objectkey.substring(index + 1, objectkey.length());
		System.out.println("name is " + name);
	}
	@Test
	public void test2() {
		long time1 = System.currentTimeMillis();
		System.out.println("time1 is " + time1);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long time2 = System.currentTimeMillis();
		System.out.println("time2 is " + time2);
		long differ = time2 - time1;
		System.out.println("differ is " + differ);
		long miao = differ / 1000;
		System.out.println("miao is " + miao);
	}

	@Test
	public void test10() {
		String reg = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$";
		String value = "l511329028";
		boolean bool = value.matches(reg);
		System.out.println("bool is " + bool);

	}

	@Test
	public void test11() {
		String picName = "yijia12345678";
		int index = picName.indexOf("/");
		picName = picName.substring(index + 1, picName.length());
		System.out.println(picName);
	}

	@Test
	private boolean isUpdateTime() {

		int STARTHOUR = 0;
		int STARTMINUTE = 0;
		int ENDHOUR = 0;
		int ENDMINUTE = 0;

		boolean bool = false;
		Calendar cal = Calendar.getInstance();// 当前日期
		int hour = cal.get(Calendar.HOUR_OF_DAY);// 获取小时
		int minute = cal.get(Calendar.MINUTE);// 获取分钟

		int currentMinute = hour * 60 + minute;// 当前时间的分钟数
		int startMinute = STARTHOUR * 60 + STARTMINUTE;// 区间开始的分钟数
		int endMinute = ENDHOUR * 60 + ENDMINUTE;// 区间结束的分钟数

		if (currentMinute >= startMinute && currentMinute <= endMinute) {
			long curretTime = cal.getTimeInMillis();

			// long lastTime = SharedUtils.getDelLogLastTime(ctx);

			SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd", Locale.CHINA);
			String currentStr = sf.format(curretTime);
			String lastStr = sf.format("");
			if (Long.parseLong(currentStr) > Long.parseLong(lastStr)) {
				bool = true;
			}
		}
		return bool;
	}

	@Test
	public void test12() {
		String str = "1,2,4,5";
		boolean bool = str.contains("1");
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		System.out.println(list.toString());
		String temp=list.toString();
		System.out.println(temp);
	}
	

}
