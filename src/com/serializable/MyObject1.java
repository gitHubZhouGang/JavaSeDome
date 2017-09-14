package com.serializable;

import java.io.Serializable;
import java.math.BigDecimal;

public class MyObject1 implements Serializable {
	
	private static final long serialVersionUID = 1L;// 序列化版本号   如果不填写默认为1  serialVersionUID作用是在反序列化之前做比较  如果不同则会抛错
	
 	private String a="100";
	private Integer b=200;
	private BigDecimal c= new BigDecimal("300");

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	public BigDecimal getC() {
		return c;
	}

	public void setC(BigDecimal c) {
		this.c = c;
	}
}
