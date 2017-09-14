package com.io;
/**
 * 通过此类来了解File IO操作原理
 * @Description: TODO
 * @author Cloop
 *
 * @date 2017年9月14日 下午3:21:39
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class FileIOClass {

	@Test
	public void fileIODome() {
		/**
		 * 1,I 外部读取操作要素   写入目标结点
		 * 注:非线程安全
		 */
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			File file = new File("F:\\IO.txt");//操作要素
			in = new FileInputStream(file);//传入操作要素
			byte buffer [] = new byte[1024];
			StringBuffer content = new StringBuffer(); 
			while (in.read(buffer) != -1) {//在这里会把读取到的操作元素放到目标结点中!   read方法最终会调用到native方法!!
				content.append(new String(buffer));
			}
			System.out.println("读取到的东西为:"+content.toString());
			File file1 = new File("F:\\IO1.txt");
			if(!file1.exists()) {
				if(!file1.createNewFile()) {
					return;
				}
			}
			out = new FileOutputStream(file1);//传入目标结点
			out.write(content.toString().getBytes());
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(in != null) {
				try {
					in.close();//close 方法关闭了系统相关调用的资源   如果有相关联的channel  则也会关闭  channel会在NIO中学习
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
