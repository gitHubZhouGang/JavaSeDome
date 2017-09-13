package com.serializable;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.BigDecimal;

public class MyObject implements Serializable{

	private String a;
	private Integer b;
	private BigDecimal c;
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
	
	public static void main(String[] args) {
		MyObject mo = new MyObject();
	
		
	}
}
