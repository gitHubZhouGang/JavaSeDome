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
	 * & | 运算
	 *   &与运算  当两个操作元对应位数上的都是为1的时候  则结果对应位的值是1 否则为0
	 *   |或运算  当两个操作元对应位数上的有一个为1 则结果值对应位位1 否则为0
	 */
	@Test
	public void huoyv(){
		int a = 10;//二进制数位   122
		System.out.println("10的2进制数:"+Integer.toBinaryString(a));
		int b = 1;//
		System.out.println("1 的2进制数:"+Integer.toBinaryString(b));
		System.out.println("a&b的结果:"+(a&b));
		System.out.println("a|b的结果:"+(a|b));
		System.out.println("把2进制数10111转化位10进制:"+Integer.valueOf("1011",2));
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
