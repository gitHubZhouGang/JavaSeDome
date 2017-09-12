package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 * @see http://www.cnblogs.com/MOBIN/p/5597215.html  此篇文章有详细的jdk动态代理的源码分析
 * 
 * @Description: TODO
 * @author Cloop
 *
 * @date 2017年9月12日 下午2:12:29
 */
public class MyHandler implements InvocationHandler {

	private Object p;

	public MyHandler() {
		super();
	}

	public MyHandler(IMyProxy p) {
		super();
		this.p = p;
	}

	public Object getP() {
		return p;
	}

	public void setP(Object p) {
		this.p = p;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		startHandler(proxy,method);
		Object returnValue = method.invoke(p, args);
		System.out.println("结束方法:"+method.getName()+"代理调用!");
		return returnValue;
	}

	public void startHandler(Object proxy,Method method) {
		System.out.println("代理类" + this.getClass() +"方法:"+method.getName()+ "转发至" + proxy.getClass());
	}
	
	/**
	 * 通过Proxy.newProxyInstance 建立目标对象  注意传入的参数必须是目标类的类加载器和接口列表   不能是目标接口的类加载器和接口列表
	 * @return 返回代理处理对象
	 */
	public Object newProxy() {
		return Proxy.newProxyInstance(p.getClass().getClassLoader(), p.getClass().getInterfaces(), this);
	}

}
