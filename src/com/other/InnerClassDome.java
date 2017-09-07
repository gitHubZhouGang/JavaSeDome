package com.other;

import org.junit.Test;

import com.other.InnerClass.NormInnerClass;

/**
 * 本类主要是为了了解不同内部类的用法
 * @see InnerClass
 * @author Cloop
 *
 */
public class InnerClassDome {

	private InnerClass innerClass = new InnerClass();
	/**
	 * 主要了解常规内部类的初始化
	 *  1,常规内部类无法通过外部类实例化 无论是通过public修饰 还是通过别的作用域修饰符修饰   只能通过外部类的实例创建对象
	 *    我们可以把常规内部类当作一个特殊的方法  只有在类加载 实例化之后才会给内部类代码分配内存空间，这样有了内部类信息之后才能实例化；
	 *    在真实情况下  只有在编译完成之后 才会产生  InnerClass.class 和 InnerClass$NormInnerClass.class两个类
	 * @see InnerClass.NormInnerClass
	 */
	@Test
	public void initNormInnerClass(){
		//InnerClass.NormInnerClass normInnerClass = new InnerClass.NormInnerClass();
		NormInnerClass normInnerClass = new InnerClass().normInnerClass;
		NormInnerClass normInnerClass1 = innerClass.new NormInnerClass();
	}
	
}
