package com.other;

import org.junit.Test;

public class BasicOP {

	/**
	 * λ�Ʋ���
	 */
	@Test
	public void  weiyi(){
		
		//����λ��  
		int i = 30;
		i = i >> 1;
		System.out.println(i);//���ս��Ϊ15
		i = i >> 1;
		System.out.println(i);//���ս��Ϊ7
		i = i>>1;
		System.out.println(i);//���ս��3
		i = i>>1;
		System.out.println(i);//���ս��1
		//����λ��
		i = i<<1;
		System.out.println(i);//���ս��2
		i = i<<1;
		System.out.println(i);//���ս��4
		i = i<<1;
		System.out.println(i);//���ս��8
		i = i<<1;
		System.out.println(i);//���ս��16
		
		int x = 1;
		x = 1<<4;
		System.out.println(x);
		x=1<<30;
		System.out.println(x);
				
	}
	
	/**
	 * ������ݿ�������
	 */
	@Test
	public void getArrayCLass(){
		String [] a = {};//empty
		System.out.println(a.getClass());
	}
	
	/**
	 * �������
	 */
	@Test
	public void arrayOp(){
		
	}
	
	
}
