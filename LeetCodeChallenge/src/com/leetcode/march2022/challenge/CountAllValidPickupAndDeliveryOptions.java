package com.leetcode.march2022.challenge;

public class CountAllValidPickupAndDeliveryOptions {

	public int countOrders(int n) {
		long ans = 1;
        int MOD = 1_000_000_007;

        for (int i = 1; i <= n; ++i) {
            // Ways to arrange all pickups, 1*2*3*4*5*...*n
            ans = ans * i;
            // Ways to arrange all deliveries, 1*3*5*...*(2n-1)
            ans = ans * (2 * i - 1);
            ans %= MOD;
        }
        
        return (int)ans;
	}

	public static void main(String[] args) {
		
		int n = 3;
		CountAllValidPickupAndDeliveryOptions andDeliveryOptions = new CountAllValidPickupAndDeliveryOptions();
		int result = andDeliveryOptions.countOrders(n);
		System.out.println(result);

	}

}
