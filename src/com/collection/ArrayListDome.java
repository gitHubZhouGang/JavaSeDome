package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.junit.Test;

/**
 * 此类主要用来学习ArrayList的结构
 * @author Cloop
 *
 */
/**
 * @see Vector
 * @see ArrayList
 *
 */
public class ArrayListDome {

	/**
	 * ArrayList 实际上就是一个数组   当当前数字容量无法容下元素的时候就会按照10为基数扩展
	 */
	@Test
	public void  initArrayList(){
		List<String> myArrayList = new ArrayList<>();//在初始化的时候  如果不指定长度 值直接把 elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA
		
		/**
		 * 在數組增加的時候回去操作 ensureCapacityInternal  用来判断当前elementData的长度，如果长度不足则通过 Arrays.copyOf(elementData, newCapacity);来替换原来的elementData
		 *    Arrays.copyOf  
		 *       1，中通过调用Array.newInstance(newType.getComponentType(), newLength);新建数组
		 *       2，System.arraycopy(original, 0, copy, 0,Math.min(original.length, newLength)); 把原来数组的元素引用放到新数组中
		 *       
		 *       System.arraycopy  是一个 navtive方法，所以不是java实现的  而是通过第三方语言  c来实现对内存的直接操作
		 */
		
		/**
		 * 注意ArrayList 的操作是非线程安全的，要想实现先线程安全   还是使用Vector
		 */
	}
}
