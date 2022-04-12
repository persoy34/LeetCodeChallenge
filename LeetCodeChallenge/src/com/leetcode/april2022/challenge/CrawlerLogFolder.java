package com.leetcode.april2022.challenge;

public class CrawlerLogFolder {
	private static String MOVE_PARENT = "../";
	private static String REMAIN = "./";
	

	public int minOperations(String[] logs) {
		int count=0;
		for (String s: logs) {
			if (s.equals(MOVE_PARENT)) {
				if (count > 0)
				count--;
			} else if (s.equals(REMAIN)) {
				continue;
			} else {
				count++;
			}
				
		}
		return count;
	}

	public static void main(String[] args) {
		String [] logs = {"d1/","d2/","./","d3/","../","d31/"};
		CrawlerLogFolder crawlerLogFolder = new CrawlerLogFolder();
		int count = crawlerLogFolder.minOperations(logs);
		System.out.println(count);

	}

}
