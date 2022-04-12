package com.geeksofgeeks.code;

import java.util.*;


class Geeks{
    // Function to insert element
    public static void insert(ArrayList<Character> clist, char c){
        
        clist.add(c);
    }
    
    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c){
     
        if(clist.contains(c))
        	System.out.println(Collections.frequency(clist, c));
        else
        	System.out.println("Not Present");
        
    }
    
    public static void main(String ... string) {
    	ArrayList<Character> clist = new ArrayList<>();
    	insert(clist,'g');
    	insert(clist,'e');
    	insert(clist,'e');
    	insert(clist,'k');
    	insert(clist,'s');
    	freq(clist,'e');
    }
}