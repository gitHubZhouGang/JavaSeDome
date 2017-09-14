package com.serializable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;

public class MyObject implements Serializable {
	
	private static final long serialVersionUID = 1L;// 序列化版本号   如果不填写默认为1  serialVersionUID作用是在反序列化之前做比较  如果不同则会抛错
	
 	private String a="10";
	private Integer b=20;
	private BigDecimal c= new BigDecimal("30");
	private MyObject1 o1 = new MyObject1();
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

	public MyObject1 getO1() {
		return o1;
	}

	public void setO1(MyObject1 o1) {
		this.o1 = o1;
	}

	public static void main(String[] args) {
		MyObject mo = new MyObject();
		ByteArrayOutputStream out = null;
		ObjectOutputStream oout = null;
		ByteArrayInputStream in = null;
		ObjectInputStream oin = null;
		try {
			// 开始向文件种序列化此类
			out = new ByteArrayOutputStream();
			oout = new ObjectOutputStream(out);
			oout.writeObject(mo);
			oout.flush();

			byte[] data = out.toByteArray();
			System.out.println("序列化之后的结果是:"+new String(data));
		
			//通过data来反序列化
			in = new ByteArrayInputStream(data);
			oin = new ObjectInputStream(in);
			MyObject o = (MyObject)oin.readObject();
			System.out.println("反序列化后的对象:"+o.toString()+"  a="+o.getA()+" b="+o.getB()+" c="+o.getC().doubleValue()+"  || "+o.getO1().toString()+"  a="+o.getO1().getA()+" b="+o.getO1().getB()+" c="+o.getO1().getC().doubleValue());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (oout != null) {
				try {
					oout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(oin != null) {
				try {
					oin.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
