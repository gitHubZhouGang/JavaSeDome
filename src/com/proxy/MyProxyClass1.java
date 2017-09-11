package com.proxy;

/**
 * 
 * @Description: TODO 代理的具体实现类
 * @author Cloop
 *
 * @date 2017年9月11日 下午4:53:51
 */
public class MyProxyClass1 implements IMyProxy{

	@Override
	public void say() {
		System.out.println(this.getClass()+"说话了");
	}

	@Override
	public void say(String content) {
		System.out.println(this.getClass()+"说了:"+content);
	}

}
