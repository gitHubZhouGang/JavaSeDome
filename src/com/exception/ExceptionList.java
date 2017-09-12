package com.exception;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.Test;

/**
 * 列出遇到的异常类集合
 * @Description: TODO
 * @author Cloop
 *
 * @date 2017年9月12日 上午11:01:16
 */
public class ExceptionList {

	@Test
	public void exception() {
		Exception e = new java.lang.ArrayIndexOutOfBoundsException();//数组越界异常
		Exception e1 = new java.lang.NullPointerException();//空指针异常
		Exception e2 = new java.lang.NumberFormatException();//数组越界异常	
		Exception e3 = new java.lang.ClassCastException();//类型强转异常
		OutOfMemoryError e4 = new java.lang.OutOfMemoryError();//内存溢出
		Exception e5 = new SQLException();//类型强转异常
		Exception e6 = new IOException();
		NoClassDefFoundError e7 = new NoClassDefFoundError();//未找到类定义错误。当Java虚拟机或者类装载器试图实例化某个类，而找不到该类的定义时抛出该错误。
		
	}
	
}
