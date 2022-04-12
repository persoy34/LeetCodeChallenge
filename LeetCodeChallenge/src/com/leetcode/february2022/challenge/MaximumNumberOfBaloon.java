package com.leetcode.february2022.challenge;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBaloon {
	String balloon="ablno";

	public int maxNumberOfBalloons(String text) {
		Map <Character, Integer> charMap= new HashMap<>();
		for (int i=0; i<text.length(); i++) {
			char ch = text.charAt(i);
			if (balloon.contains(ch+"")) {
				charMap.put(ch, charMap.getOrDefault(ch, 0)+1);
				
			} 
		}
		int valB= charMap.getOrDefault('b',0);
		int valA= charMap.getOrDefault('a',0);
		int valL = charMap.getOrDefault('l',0);
		int valO = charMap.getOrDefault('o',0);
		int valN = charMap.getOrDefault('n',0);
		
		return Math.min(valB,Math.min(valA, Math.min(valL/2, Math.min(valO/2, valN))) );
	}

	public static void main(String[] args) {
		 String text = "mbetypbpefxvviadqaodrbjeoacfomepmzymiudltgnvnpbowwmjgpzzhtiismearuwocsgbiimiqqzaozgeizikrlxmupfzjzmlfttqqbpfblqfkecsdfbsceqjhubfxksivrfwvukapxmuciybfhzlmpeamdxziptxregymqtmgcsujmugissgnlbhxbcxxeoumcqyulvahuianbaaxgzrtmshjguqdaxvxndzoqvwmcjfhpevavnrciqbymnlylbrfkkiceienoarfrzzxtuaqapaeqeqolozadmtgjyhfqzpuaskjuawxqkdqyjqcmbxtvshzrquvegcuyuckznspmrxvqdassidcmrajedsnuuumfwqzvasljlyvfefktiqgvzvdzojtjegsyhbepdkuwvgrfscezvswywmdavpxlekbrlkfnbyvlobazmvgulxrfdranuhomkrlpbfeagfxxxuhjuqhbkhznixquxrxngwimdxdhqbdaouitsvcdmbwxbbaomkgxsqwnexbjjyhtxvkjfqkrrxjghvzqsattubphryqxxdyjkihfnzvjhohnhdlfwoqiwtmwzfgcyhyqtcketvgnbchcxvnhcsoosirfqgdgcsitegzlxdfijzmxnvhrulmgvoqfpzesootscnxenokmmozmoxpaverydbsnimwacjqhrtxkqtvghjyushoctxphxzztukgmnoeycqaeukymvwxcsyvvctflqjhtcvjtxncuvhkptkjnzaetwbzkwnseovewuhpkaxiphdicgacszzdturzgjkzwgkmzzavykancvvzaafgzjhcyicorrblmhsnnkhfkujttbkuuedhwguuaapojmnjdfytdhrepjwcddzsoeutlbbljlikghxefgbqenwamanikmynjcupqpdjnhldaixwygcvsgdkzszmsptqqnroflgozblygtiyaxudwmooiviqcosjfksnevultrf";
		 MaximumNumberOfBaloon maximumNumberOfBaloon= new MaximumNumberOfBaloon();
		 int value = maximumNumberOfBaloon.maxNumberOfBalloons(text);
		 System.out.println(value);

	}

}
