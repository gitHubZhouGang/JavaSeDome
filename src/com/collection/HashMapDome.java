package com.collection;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * ��Ҫ�����˽�HashMap��Դ��
 * @author Cloop
 *
 */
public class HashMapDome {

	@Test
	public void initHashMap(){
		/**
		 * ��HashMap��������  ��ֱ�ӿ�Դ��
		 */
		/**
		 * HashMap�����ֹ��캯��   �ֱ�Ϊ�չ���   ����ʼ��initialCapacity����   ��initialCapacity��loadFactor ��Map����
		 *    1���չ��캯��  �ڴ��������ʱ��ֻ�������� loadFactor   
		 *    2,��initialCapacity���캯�� ����С�� 1<<30���Ҵ��ڻ����0   ���������Ҳ��ֱ������Ϊ���ֵ�������
		 *    �����ص㿴�����ִ�Map�Ĺ��� 
		 */
		Map<String, String> map = new HashMap<>();
		Map<String, String> map1 = new HashMap<>(111);
		Map<String, String> map2 = new HashMap<>(111,0.2f);
		Map<String, String> map3 = new HashMap<>(map1);
		
		/**
		 * ͨ�����е�Map��ȥ�����µ�Map ��ֱ�Ӱ����е�Mapkey����Hash����֮��  ��ֵ�ŵ��µ�Map����ȥ
		 * 1��this.loadFactor = DEFAULT_LOAD_FACTOR;   ������һ��  ��ʼ��һ��loadFactor
		 * 2��putMapEntries(m, false);
		 */
		
	}
}
