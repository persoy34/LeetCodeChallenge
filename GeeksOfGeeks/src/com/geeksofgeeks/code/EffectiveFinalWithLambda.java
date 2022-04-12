package com.geeksofgeeks.code;

public class EffectiveFinalWithLambda {
	public static void main(String args[]) {
		String effectiveFinal = "I am non final local variable";
		Runnable r = () -> {
			System.out.println("Value of effectively variable is : " + effectiveFinal);
		};
		Thread t = new Thread(r);
		t.start();
	}
}
