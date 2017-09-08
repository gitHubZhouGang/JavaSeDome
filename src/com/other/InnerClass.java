package com.other;

/**
 * 此类主要是为了了解内部类 在Java中允许在一个类中再去定义一个类，这个类就是内部类； 内部类分为： 1,常规内部类 2,局部内部类 3,匿名内部类
 * 4,静态内部类
 * 
 * @author Cloop
 *
 */
public class InnerClass {

	private int outParam1 = 0;

	public int getOutParam1() {
		return outParam1;
	}

	public void setOutParam1(int outParam1) {
		this.outParam1 = outParam1;
	}

	/**
	 * 常规内部类
	 */
	public NormInnerClass normInnerClass = new NormInnerClass();//常规内部类可以在外部类中实例化

	public class NormInnerClass {
		/**
		 * 1,内部类可以直接使用外部类的成员(无论是什么作用域)和方法
		 * 2,如果想要使用外部类实例   可以直接通过InnerClass.this 获得外部类实例引用
		 */
		// outParam1 = 2;
		InnerClass innerClass = InnerClass.this;

		public NormInnerClass() {
			outParam1 = 2;
		}

		public InnerClass getInnerClass() {
			return InnerClass.this;
		}

		public void display() {
			System.out.println(outParam1);
			innerClass.getOutParam1();
			System.out.println("调用外部类方法:" + getOutParam1());
		}
	}

	
	
}
