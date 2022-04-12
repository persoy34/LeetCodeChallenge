package com.letcode.code.challange;

import java.util.Stack;

public class ValidParanthesisString {
	
	public boolean checkValidString(String s) {
		Stack<Character> st = new Stack<Character>();
        int a_c=0,b_c=0; // a_c stores *s present after (s till now and b_c stores *s present before (s till now
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                if(st.isEmpty()){
                    b_c+=a_c;
                    a_c=0; // reset a_c , flush it to b_c
                }
                else{
                    if(a_c>st.size()){   // take out the *s that might be needed to kill off present (s and flush the remaining *s to b_c.
                        b_c+=(a_c-st.size());
                        a_c=st.size();
                    }
                }
                st.push(c);
            }
            else if(c=='*'){
                if(st.isEmpty()){b_c++;}
                else{a_c++;}
            }
            else{
                if(st.isEmpty()){
                     // reset a_c and use b_c to kill off )
                    b_c+=a_c;
                    a_c=0;
                    if(b_c==0){return false;}
                    else{b_c--;}
                }
                else{
                 st.pop(); // use ( to kill off )   
                }
            }
        }
        if(!st.isEmpty() & a_c<st.size()){return false;}
        return true;
    }
	public static void main(String[] args) {
		ValidParanthesisString paranthesisString = new ValidParanthesisString();
		boolean result = paranthesisString.checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*");
		System.out.println(result);
	}

}
