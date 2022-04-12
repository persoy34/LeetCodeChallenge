package com.leetcode.january2022.challenge;

public class CapitalizeTheTitle {

	public  static String capitalizeTitle(String title) {
		
		if (title == null || title.length() ==0)
			return title;
		String [] str = title.split(" ");
		for (int i=0; i<str.length; i++) {
			if (str[i].length() <= 2) {
				str[i]=str[i].toLowerCase();
			} else {
				str[i]=str[i].toLowerCase();
				str[i]=str[i].substring(0,1).toUpperCase()+str[i].substring(1);
			}
		}
		return String.join(" ", str);
//		StringBuilder builder = new StringBuilder();
//		for (int i=0;i <title.length(); i++) {
//			if (!Character.isWhitespace(title.charAt(i))) {
//				builder.append(title.charAt(i));
//				
//			} else {
//					if (builder.length() <=2) {
//						title=title.replace(builder.toString(), builder.toString().toLowerCase());
//					} else {
//					   String temp = builder.toString().toLowerCase();
//					   temp=(temp.charAt(0)+"").toUpperCase() + temp.substring(1,temp.length());
//					   title=title.replace(builder.toString(), temp);
//					}
//					builder= new StringBuilder();
//			}
//		}
//		if (builder.length() <=2) {
//			title=title.replace(builder.toString(), builder.toString().toLowerCase());
//		} else {
//		   String temp = builder.toString().toLowerCase();
//		   temp=(temp.charAt(0)+"").toUpperCase() + temp.substring(1, temp.length());
//		   title=title.replace(builder.toString(), temp);
//		}
//		return title;

	}

	public static void main(String[] args) {
		String title = "Gteliwir Twtz Iosg Rljb fpe Setus f";
        title = capitalizeTitle(title);
        System.out.println(title);
	}

}
