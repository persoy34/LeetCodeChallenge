package com.leetcode.january2022.challenge;

public class ConcatenationOfConsecutiveBinaryNumbers {
    
	public int concatenatedBinary(int n) {
		 //calculate the length of binary string	    
	    long MOD = 1000_000_007;
	    
	    int length = 0;
	    long sum = 0;
	    for(int i=1; i<=n; i++)
	    {
	        if((i & i-1) == 0)
	        {
	            length++;
	        }
	        //System.out.println(length);
	        sum <<= length;
	        sum += i;
	        
	        if(sum > MOD)
	        {
	            sum %= MOD;
	        }
	    }
	    
	    return (int)(sum % MOD);
	}

	public static void main(String[] args) {
		int n = 42;
		ConcatenationOfConsecutiveBinaryNumbers binaryNumbers = new ConcatenationOfConsecutiveBinaryNumbers();
		int result = binaryNumbers.concatenatedBinary(n);
		System.out.println(result);

	}

}
