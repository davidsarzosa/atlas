package com.neotech.lesson30;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class RECAP {
	
	// TreeMap: will order pairs alphabetically according to the key
			//Map<String, Integer> groceries = new TreeMap<>();
	
//	Map<String, Integer> groceries = new TreeMap<>();
//	Set<String> keys = groceries.keySet(); // getting just keys
//	System.out.println(keys); // printing just keys
 
	/*
	 * Interface / Class,Description,Implements / Extends,Ordering,Duplicates Allowed,Example
	 * 
List,"Ordered collection, allows duplicates",Collection,Yes,Yes,List<String> list = new ArrayList<>();
├─ ArrayList,"Resizable array, fast access",List,Yes,Yes,"list.add(""Apple"");"
├─ LinkedList,"Doubly linked list, fast insert/remove","List, Deque",Yes,Yes,LinkedList<String> linkedList = new LinkedList<>();
└─ Vector,Synchronized version of ArrayList,List,Yes,Yes,Vector<String> vector = new Vector<>();
  └─ Stack,LIFO stack based on Vector,Vector,Yes,Yes,"Stack<String> stack = new Stack<>(); stack.push(""A"");"
  
  
Set,"Unordered, no duplicates",Collection,No,No,Set<String> set = new HashSet<>();
├─ HashSet,Backed by hash table,Set,No,No,"set.add(""Apple"");"
├─ LinkedHashSet,Maintains insertion order,HashSet,Yes,No,LinkedHashSet<String> lhs = new LinkedHashSet<>();
└─ TreeSet,Sorted (natural or comparator),NavigableSet,Yes,No,TreeSet<String> treeSet = new TreeSet<>();


Queue / Deque,FIFO (Queue) / double-ended (Deque),Collection,Yes,Yes,Queue<String> queue = new LinkedList<>();
├─ PriorityQueue,Elements ordered by priority,Queue,Yes,Yes,PriorityQueue<Integer> pq = new PriorityQueue<>();
├─ ArrayDeque,Resizable array implementation of Deque,Deque,Yes,Yes,Deque<String> deque = new ArrayDeque<>();
└─ LinkedList,Also implements Deque,"Deque, List",Yes,Yes,Deque<String> llDeque = new LinkedList<>();


Map (Not Collection),"Key-value pairs, no duplicate keys",—,—,No (keys),"Map<String, Integer> map = new HashMap<>();"
├─ HashMap,Unordered key-value storage,Map,No,Yes (values),"map.put(""apple"", 1);"
├─ LinkedHashMap,Maintains insertion order of keys,HashMap,Yes,Yes (values),"LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();"
└─ TreeMap,Sorted by key (natural or comparator),NavigableMap,Yes,Yes (values),"TreeMap<String, Integer> tm = new TreeMap<>();"
└─ Hashtable,Legacy synchronized version of HashMap,Map,No,Yes,"Hashtable<String, Integer> ht = new Hashtable<>();"

	 */

}
