package com.io;
/**
 * 了解Object IO
 * @Description: TODO
 * @author Cloop
 *
 * @date 2017年9月15日 上午9:27:17
 */

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Test;

public class ObjectIOClass {

	/**
	 * ObjectStream 是用来对象序列化的,我们必须对需要序列化的对象实现 Serializable
	 *  详细参见  package serializable
	 */
	@Test
	public void ObjectIODome() {
		ByteArrayOutputStream out = null;
		ObjectOutputStream oout = null;
		InputStream in = null;
		ObjectInputStream oin = null;
		try {
			MyObject o = new MyObject();
			out = new ByteArrayOutputStream();
			oout = new ObjectOutputStream(out);
			oout.writeObject(o);
			byte[] data = out.toByteArray();
			System.out.println("序列化之后的结果是:"+new String(data));
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(oout != null) {
				try {
					oout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(out != null) {
				try {
					out.close();
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
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public final static class MyObject implements Serializable{
		private String a = "1";
	}
}
