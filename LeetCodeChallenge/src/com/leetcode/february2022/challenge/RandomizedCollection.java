package com.leetcode.february2022.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
class RandomizedCollection {
	HashMap<Integer, Set<Integer>> map;
	List<Integer> list;
	Random random;


    public RandomizedCollection() {
    	map = new HashMap<>();
    	list = new ArrayList<>();
    	random = new Random();
        
    }
    
	public boolean insert(int val) {
    	boolean isExist = false;
        if (map.containsKey(val)) {
        	list.add(val);
        	Set<Integer> temp =map.get(val);
        	temp.add(list.size()-1);
        	map.put(val, temp);
        } else {
        	list.add(val);
        	Set<Integer> temp= new HashSet<>();
        	temp.add(list.size()-1);
        	map.put(val, temp);
        	isExist=true;
        }
        return isExist;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        
        int pos = map.get(val).iterator().next();
        map.get(val).remove(pos);
        list.set(pos, list.get(list.size() - 1));
        map.get(list.get(pos)).add(pos);
        map.get(list.get(pos)).remove(list.size() - 1);
        list.remove(list.size() - 1);
        if(map.get(val).size() == 0)
            map.remove(val);
        return true;
       
    }
    
    public int getRandom() {
        int index = random.nextInt(list.size());
        int val = list.get(index);
       return val;
    }
    
    public static void main(String ...string) {
    	//["RandomizedCollection","insert","insert","insert","getRandom","remove","getRandom"]
    	//[[],[1],[1],[2],[],[1],[]]
    	RandomizedCollection collection = new RandomizedCollection();
    	boolean result = collection.insert(1);
    	System.out.println(result);
    	result = collection.insert(1);
    	System.out.println(result);
    	result = collection.insert(2);
    	System.out.println(result);
    	int random = collection.getRandom();
    	System.out.println(random);
    	result = collection.remove(1);
    	System.out.println(result);
    	random = collection.getRandom();
    	System.out.println(random);
    	
    }
}

