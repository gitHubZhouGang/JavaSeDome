package com.collection;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 主要用来了解HashMap的源码
 * 
 * @author Cloop
 *
 */
public class HashMapDome {

	@Test
	public void getHashCode(){
		/**
		 * String 的Hashcode是通过
		 */
		String key = "a";
		System.out.println(key.hashCode());
		
		Integer a = 1000;
		System.out.println(a.hashCode());
	}
	
	@Test
	public void initHashMap() {
		/**
		 * 在HashMap对象属性 请直接看源码
		 */
		/**
		 * HashMap有四种构造函数 分别为空构造 带初始化initialCapacity构造
		 * 带initialCapacity和loadFactor 带Map构造 1，空构造函数 在创建对象的时候只是设置了 loadFactor
		 * 2,带initialCapacity构造函数 必须小于 1<<30并且大于或等于0 如果超过了也会直接设置为最大值的这个数
		 * 我们重点看第四种带Map的构造
		 */
		Map<String, String> map = new HashMap<>();
		Map<String, String> map1 = new HashMap<>(111);
		Map<String, String> map2 = new HashMap<>(111, 0.2f);
		Map<String, String> map3 = new HashMap<>(map1);

		/**
		 * 通过现有的Map再去创造新的Map 是直接把现有的Mapkey进行Hash计算之后 把值放到新的Map里面去
		 * 1，this.loadFactor = DEFAULT_LOAD_FACTOR; 和其他一样 初始化一下loadFactor
		 * 2，putMapEntries(m, false);
		 */
		
		/**
		 * HashMap的put(K key, V value)方法
		 * 	1,调用 putVal()方法  传入 putVal(hash(key), key, value, false, true);
		 *  2,hash(key)
		 */
		
		

	}
	
}
