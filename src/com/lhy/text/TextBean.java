package com.lhy.text;

public class TextBean<T> {
	
	public String ret;
	public TextBean(String ret, String message, T body) {
		super();
		this.ret = ret;
		this.message = message;
		this.body = body;
	}
	public String message;
	public T body;
}
