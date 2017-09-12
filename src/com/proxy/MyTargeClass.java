package com.proxy;

/**
 * 静态代理类
 * @Description: TODO
 * @author Cloop
 *
 * @date 2017年9月12日 上午9:37:20
 */
public class MyTargeClass implements IMyProxy{

	private IMyProxy proxyClass;
	public MyTargeClass(IMyProxy proxyClass) {
		this.proxyClass = proxyClass;
	}
	@Override
	public void say() {
		startHandler();
		proxyClass.say();
		
	}
	@Override
	public void say(String content) {
		startHandler();
		proxyClass.say(content);
	}
	
	public void startHandler() {
		System.out.println("代理类"+this.getClass()+"转发至"+proxyClass.getClass());
	}
	public IMyProxy getProxyClass() {
		return proxyClass;
	}
	public void setProxyClass(IMyProxy proxyClass) {
		this.proxyClass = proxyClass;
	}
	
}
