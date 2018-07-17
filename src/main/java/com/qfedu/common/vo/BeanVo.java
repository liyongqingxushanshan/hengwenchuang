package com.qfedu.common.vo;
//统一结果集  主要是针对非查询操作的数据返回  json
public class BeanVo<T> {
	private int code;//成功 0  失败 1
	private String msg;
	private T data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

}
