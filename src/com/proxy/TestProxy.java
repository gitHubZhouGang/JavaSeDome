package com.proxy;
/**
 * 使用代理类
 * @Description: TODO
 * @author Cloop
 *
 * @date 2017年9月12日 上午9:43:37
 */

import org.junit.Test;

public class TestProxy {

	/**
	 * 测试静态代理
	 */
	@Test
	public void testStaticProxy() {
		MyProxyClass1 p1 = new MyProxyClass1();
		MyProxyClass2 p2 = new MyProxyClass2();
		MyTargeClass targerClass = new MyTargeClass(p1);
		targerClass.say();
		targerClass.say("哈哈");
		targerClass.setProxyClass(p2);
		targerClass.say();
		targerClass.say("哈哈");
	}
	
	/**
	 * 测试jdk 动态代理
	 */
	@Test
	public void testDyncProxy() {
		try {
			MyProxyClass1 p1 = new MyProxyClass1();
			MyHandler hander = new MyHandler(p1);
			IMyProxy p = (IMyProxy)hander.newProxy();
			p.say();
			p.say("hello");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
