package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionDome {

	public static void main(String[] args) {

		// 集合框架顶级
		Collection myCollection = null;

		// --List
		List<String> myList = null;
		ArrayList<String> myArrayList = new ArrayList<>();
		// myArrayList.set(1, "a");
		System.out.println("myArrayList 长度" + myArrayList.size());
		Vector<String> myVector = null;
		LinkedList<String> myLinkList = null;

		// 集合框架Map
		Map<String, String> myMap = null;
		Hashtable<String, String> myHashTable = null;
		LinkedHashMap<String, String> myLinkedHashMap = null;
		HashMap<String, String> myHashMap = null;
		TreeMap<String, String> myTreeMap = null;

		// --Set
		Set mySet = null;
		HashSet<String> myHashSet = null;
		LinkedHashSet<String> myLinkedHashSet = null;
		TreeSet<String> myTreeSet = null;

		// -Queue
		Queue<String> myQueue = null;
		LinkedList<String> myLinkList1 = null;
		PriorityQueue<String> myPriorityQueue = null;

	}
}
