package com.letcode.code.challange;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    LRUCache cache;
    private Map<Integer,Entry> hashmap;
    private int capacity;
    Entry start, end;
    public LRUCache(int capacity) {
    	this.capacity =capacity;
    	hashmap = new HashMap<>();
    }
    
    public int get(int key) {
    	if (hashmap.containsKey(key)) // Key Already Exist, just update the
		{
			Entry entry = hashmap.get(key);
			removeNode(entry);
			addAtTop(entry);
			return entry.value;
		}
		return -1;
    }
    
    public void put(int key, int value) {
		if (hashmap.containsKey(key)) // Key Already Exist, just update the value and move it to top
		{
			Entry entry = hashmap.get(key);
			entry.value = value;
			removeNode(entry);
			addAtTop(entry);
		} else {
			Entry newnode = new Entry();
			newnode.left = null;
			newnode.right = null;
			newnode.value = value;
			newnode.key = key;
			if (hashmap.size() >= capacity) // We have reached maxium size so need to make room for new element.
			{
				hashmap.remove(end.key);
				removeNode(end);				
				addAtTop(newnode);

			} else {
				addAtTop(newnode);
			}

			hashmap.put(key, newnode);
		}
    }
    public void addAtTop(Entry node) {
		node.right = start;
		node.left = null;
		if (start != null)
			start.left = node;
		start = node;
		if (end == null)
			end = start;
	}

	public void removeNode(Entry node) {

		if (node.left != null) {
			node.left.right = node.right;
		} else {
			start = node.right;
		}

		if (node.right != null) {
			node.right.left = node.left;
		} else {
			end = node.left;
		}
	}
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		LRUCache lrucache = new LRUCache(2);
		lrucache.put(1, 1);
		lrucache.put(2, 2);
		System.out.println(lrucache.get(1));
		lrucache.put(3, 3);
		System.out.println(lrucache.get(2));
		lrucache.put(4, 4);
		System.out.println(lrucache.get(1));
		System.out.println(lrucache.get(3));
		System.out.println(lrucache.get(4));


	}
}
class Entry {
	int value;
	int key;
	Entry left;
	Entry right;
}
