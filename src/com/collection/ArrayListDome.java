package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.junit.Test;

/**
 * ������Ҫ����ѧϰArrayList�Ľṹ
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
	 * ArrayList ʵ���Ͼ���һ������   ����ǰ���������޷�����Ԫ�ص�ʱ��ͻᰴ��10Ϊ������չ
	 */
	@Test
	public void  initArrayList(){
		List<String> myArrayList = new ArrayList<>();//�ڳ�ʼ����ʱ��  �����ָ������ ֱֵ�Ӱ� elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA
		
		/**
		 * �ڔ��M���ӵĕr���ȥ���� ensureCapacityInternal  �����жϵ�ǰelementData�ĳ��ȣ�������Ȳ�����ͨ�� Arrays.copyOf(elementData, newCapacity);���滻ԭ����elementData
		 *    Arrays.copyOf  
		 *       1����ͨ������Array.newInstance(newType.getComponentType(), newLength);�½�����
		 *       2��System.arraycopy(original, 0, copy, 0,Math.min(original.length, newLength)); ��ԭ�������Ԫ�����÷ŵ���������
		 *       
		 *       System.arraycopy  ��һ�� navtive���������Բ���javaʵ�ֵ�  ����ͨ������������  c��ʵ�ֶ��ڴ��ֱ�Ӳ���
		 */
		
		/**
		 * ע��ArrayList �Ĳ����Ƿ��̰߳�ȫ�ģ�Ҫ��ʵ�����̰߳�ȫ   ����ʹ��Vector
		 */
	}
}
