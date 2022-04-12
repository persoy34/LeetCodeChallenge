package com.letcode.code.challange;

import java.util.Stack;

class MinStack {
	Stack<Long> s; 
    Integer minEle; 
    /** initialize your data structure here. */
    public MinStack() {
    	s = new Stack<Long>();
    }
    
    public void push(int x) {
    	if (s.isEmpty()) { 
            minEle = x; 
            s.push((long)x); 
            System.out.println("Number Inserted: " + x); 
            return; 
        } 
  
        // If new number is less than original minEle 
        if (x < minEle) { 
        	long val= x ;
        	val += x;
        	val -= minEle;
            s.push(val); 
            minEle = x; 
        } 
  
        else
            s.push((long)x); 
  
        System.out.println("Number Inserted: " + x); 
    } 
    
    public void pop() {
        if (s.isEmpty()) { 
            System.out.println("Stack is empty"); 
            return; 
        } 
  
        System.out.print("Top Most Element Removed: "); 
        long t =s.pop(); 
  
        // Minimum will change as the minimum element 
        // of the stack is being removed. 
        if (t < minEle) { 
            System.out.println(minEle); 
            int temp = minEle;
            long longTemp = minEle;
            longTemp +=minEle;
            longTemp-=t;
            minEle = Math.toIntExact(longTemp);
            t = temp;
        } 
  
        else
            System.out.println(t); 
    }
    
    public long top() {
        if (s.isEmpty()) { 
            System.out.println("Stack is empty "); 
            return -minEle; 
        } 
  
        long t =s.peek(); // Top element. 
  
        System.out.println("Top Most Element is: "+t); 
  
        // If t < minEle means minEle stores 
        // value of t. 
        if (t < minEle) 
           return minEle; 
        else
            return t; 
    }
    
    public int getMin() {
    	System.out.println(minEle);
       return minEle;
    }
    
    public static void main(String ...strings) {
    	MinStack minStack = new MinStack();
    	minStack.push(2147483646);
    	minStack.push(2147483646);
    	minStack.push(2147483647);
    	minStack.top();
    	minStack.pop();
    	minStack.getMin();
    	minStack.pop();
    	minStack.getMin();
    	minStack.pop();
    	minStack.push(2147483647);
    	minStack.top();
    	minStack.getMin();
    	minStack.push(-2147483648);
    	minStack.top();
    	minStack.getMin();
    	minStack.pop();
    	minStack.getMin();
    	
    }
}
