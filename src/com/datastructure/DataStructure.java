package com.datastructure;

import java.util.ArrayList;
import java.util.List;

public class DataStructure {

	public static void main(String[] args) {
		int size = 1;
		size++;
		System.out.println(size);
		List<String> arrayList = new ArrayList<>();
		System.out.println("没有add之前的size："+arrayList.size());
		arrayList.add("a");
		
		System.out.println("没有add之后的size："+arrayList.size());
		
	}
}
