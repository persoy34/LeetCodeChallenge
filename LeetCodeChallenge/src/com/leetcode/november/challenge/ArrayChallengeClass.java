package com.leetcode.november.challenge;

public class ArrayChallengeClass {
	public static String arrayChallenge(String[] strArr) {
	    // code goes here  
		String []mainStr= strArr[0].replace("[", "").replace("]","").split(",");
		int firstVal = Integer.valueOf(mainStr[0].trim());
		int secondVal= Integer.valueOf(mainStr[1].trim());
		String [] numberValues = strArr[1].replace("[", "").replace("]","").split(",");
		int diff=0;
    	if (firstVal < secondVal) {
    		diff=secondVal-firstVal;
    	} else {
    		diff= firstVal-secondVal;
    	}
    	if (diffExist(diff, numberValues)) {
    		return diff+"";
    	}
	    for (int i=0; i<numberValues.length-1; i++) {
	    	int temp1= Integer.valueOf(numberValues[i].trim());
	    	for (int j=i+1; j<numberValues.length; j++) {
	    		int temp2= Integer.valueOf(numberValues[j].trim());
	    		if ((temp1+firstVal== temp2+secondVal) ||
	    		     (firstVal-temp1 == secondVal+temp2) ||
	    		     (firstVal-temp1 == secondVal - temp2) ||
	    		     (firstVal+ temp1 == secondVal -temp2)) {
	    			return temp1+","+temp2;
	    		}
	    	}
	    	
	    }
	    return "";
	  }

	private static boolean diffExist(int diff, String[] numberValues) {
		for (String val: numberValues) {
			int intVal= Integer.valueOf(val.trim());
			if (intVal==diff) 
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String []arr={"[13, 4]", "[1, 2, 3, 6, 14]"};
		String result = arrayChallenge(arr);
		System.out.println(result);
		
	}

}
