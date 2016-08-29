package com.lhy.thread;

import javax.swing.plaf.SliderUI;

public class ThreadDemo {

	
	public static int  requestToServer(){
		final int  i=1;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
			try {
				System.out.println("haha");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			}
		}).start();
		return i;
	}
	
}
