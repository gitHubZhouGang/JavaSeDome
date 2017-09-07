package com.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * 测试实现了RandomAccess标记接口的速度
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
		System.out.println("耗时1："+(new Date().getTime()-date1.getTime()));
		Date date2 = new Date();
		for(Iterator i=testA.iterator(); i.hasNext();){
			i.next();
		}
		System.out.println("耗时1："+(new Date().getTime()-date2.getTime()));
		
		/**
		 * 实验证明  实现了标记接口的类的访问内存速度比没实现的快
		 */
	}
}
