package com.chao.springboot.common;

public class ResultMsg {

	private boolean status;
	
	private String msg;
	
	private String content;

	public ResultMsg(boolean status, String msg, String content){
		this.status = status;
		this.msg = msg;
		this.content = content;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
