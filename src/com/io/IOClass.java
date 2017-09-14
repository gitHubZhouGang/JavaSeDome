package com.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import org.junit.Test;

/**
 * 通过此类来了解整个IO框架 在Java中如果按照操作基础单元IO分为字节IO和字符IO,顾名思义字节IO API是以byte为基础操作单元实现的
 * 字符是以单个字符为操作单位的 如果按照I/O分 字节的InputStream 写入 OutputStream 读出 字符的Writer 写入
 * Reader读出 具体分类可以用参见:http://blog.csdn.net/yczz/article/details/38761237
 * 
 * 注:为了方便理解IO  我们可以把Stream看为一个通道,把操作的资源叫做操作要素 操作元素最后抵达的地方叫做目标点
 * 	   
 * @Description: TODO
 * @author Cloop
 *
 * @date 2017年9月14日 下午1:18:09
 */
public class IOClass {

	@Test
	public void initInputStreamOrOutPutStream() {
		/**
		 * I 输入操作流
		 */
		InputStream fileIn = null;
		InputStream objectIn = null;
		InputStream pipedIn = null;
		InputStream byteIn = null;

		/**
		 * O 输出操作流
		 */
		OutputStream fileOut = null;
		OutputStream objectOut = null;
		OutputStream pipedOut = null;
		OutputStream byteOut = null;
		try {
			/**
			 * I 输入操作流
			 */
			fileIn = new FileInputStream("");// 文件操作输入流
			objectIn = new ObjectInputStream(fileIn);// 对象操作输入流
			pipedIn = new PipedInputStream();// 管道操作输入流 它必须和PipedOutputStream一同建立一个管道然后单独使用
			byteIn = new ByteArrayInputStream(new byte[10]);// 字节数组操作输入流

			/**
			 * O 输出操作流
			 */
			fileOut = new FileOutputStream("");// 文件输出操作流
			objectOut = new ObjectOutputStream(fileOut);// 对象输出操作流
			pipedOut = new PipedOutputStream();// 管道输出操作流
			byteOut = new ByteArrayOutputStream();// 字节数组输出操作流
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileIn != null) {
				try {
					fileIn.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (objectIn != null) {
				try {
					objectIn.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pipedIn != null) {
				try {
					pipedIn.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (byteIn != null) {
				try {
					byteIn.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			/**
			 * O 输出操作流
			 */
			if (fileOut != null) {
				try {
					fileOut.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (objectOut != null) {
				try {
					objectOut.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pipedOut != null) {
				try {
					pipedOut.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (byteOut != null) {
				try {
					byteOut.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
