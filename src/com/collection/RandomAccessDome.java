package com.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * ����ʵ����RandomAccess��ǽӿڵ��ٶ�
 * 
 * @author Cloop
 *
 */
public class RandomAccessDome {

	public static void main(String[] args) {
		List<String> testA = new ArrayList<>();
		for(int i=0;i<9999999;i++){
			testA.add(""+i);
		}
		Date date1 = new Date();
		for(int i=0;i<testA.size();i++){
			testA.get(i);
		}
		System.out.println("��ʱ1��"+(new Date().getTime()-date1.getTime()));
		Date date2 = new Date();
		for(Iterator i=testA.iterator(); i.hasNext();){
			i.next();
		}
		System.out.println("��ʱ1��"+(new Date().getTime()-date2.getTime()));
		
		/**
		 * ʵ��֤��  ʵ���˱�ǽӿڵ���ķ����ڴ��ٶȱ�ûʵ�ֵĿ�
		 */
	}
}
