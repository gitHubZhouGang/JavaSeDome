package com.other;

import org.junit.Test;

public class BasicOP {

	/**
	 * 位移操作
	 */
	@Test
	public void  weiyi(){
		
		//向右位移  
		int i = 30;
		i = i >> 1;
		System.out.println(i);//最终结果为15
		i = i >> 1;
		System.out.println(i);//最终结果为7
		i = i>>1;
		System.out.println(i);//最终结果3
		i = i>>1;
		System.out.println(i);//最终结果1
		//向左位移
		i = i<<1;
		System.out.println(i);//最终结果2
		i = i<<1;
		System.out.println(i);//最终结果4
		i = i<<1;
		System.out.println(i);//最终结果8
		i = i<<1;
		System.out.println(i);//最终结果16
		
		int x = 1;
		x = 1<<4;
		System.out.println(x);
		x=1<<30;
		System.out.println(x);
				
	}
	
	/**
	 * 获得数据库类类型
	 */
	@Test
	public void getArrayCLass(){
		String [] a = {};//empty
		System.out.println(a.getClass());
	}
	
	/**
	 * 数组操作
	 */
	@Test
	public void arrayOp(){
		
	}
	
	
}
