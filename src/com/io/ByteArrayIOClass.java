package com.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Test;

/**
 * 了解 ByteArray IO的操作以及实现原理
 * 
 * @Description: TODO
 * @author Cloop
 *
 * @date 2017年9月14日 下午1:48:56
 */
public class ByteArrayIOClass {

	@Test
	public void byteArrayIODome() {
		ByteArrayInputStream in = null;
		ByteArrayOutputStream out = null;

		try {
			/**
			 * 通过源码看出 ByteArrayInputStream是线程安全的 在元素操作方法之前都是有sync的
			 * 其中我们要注意几点:
			 * 	1,reast 方法是把当前位置角标转化为标记点角标的   mark参数 和pos参数
			 *  2,close 方法是个空方法 没有任何操作!  但是如果实例调用了此方法之后就不能调用任何其他方法   否则会报IO异常
			 */
			String content = "1234 2234 3234 换个姿势 再来一次";
			byte[] buffer = content.getBytes();//操作要素
			byte[] targArr = new byte[content.getBytes().length+10];//目标点
			in = new ByteArrayInputStream(buffer);//把需要读写的东西传入
			in.read(targArr);//直接读到目标数组中
			System.out.println("读取到的对象是:"+new String(targArr));
			
			/**
			 * ByteArrayOutputStream 也是线程同步的
			 */
			out = new ByteArrayOutputStream();//如果不传入初始临时目标结点长度 则默认为32  如果能够指定的话尽可能指定  否则可能会使的数组扩容而影响性能
			out.write(targArr);//targArr作为Out的操作要素
			out.flush();
			byte[] targe1 = out.toByteArray();//获得目标点
			System.out.println("读取到的对象是:"+new String(targe1));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
}
