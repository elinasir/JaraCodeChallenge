package com.codeChallenge.eli.QACode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortString {

	public static void main(String[] args) {
		
		
		//sort string array
		String [] month = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                "aug", "Sep", "Oct", "nov", "Dec"};
	
		
		
		List<String> list = new ArrayList<String>();
		list.add(0, "car");
		System.out.println(list);
		list.add(1, "toyota");
		System.out.println(list);
		list.add(0, "mazda");
		System.out.println(list);
		list.add(2, "BMW");
		System.out.println(list);
		list.add(2, "Jeep");
		System.out.println(list);
		
		 //natural order
		Arrays.sort(month);
		System.out.println(Arrays.toString(month));   
		
		
		// case insensitive order
		Arrays.sort(month,String.CASE_INSENSITIVE_ORDER);   
		System.out.println(Arrays.toString(month));  

		// reverse order
		Arrays.sort(month,Collections.reverseOrder());      
		System.out.println(Arrays.toString(month));
		
		//descending order
		Arrays.sort(month,new Comparator<String>(){
			
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});
		System.out.println(Arrays.toString(month));
		
		//sort string
		String str = "gfedcba";
		char[] charOfString= str.toCharArray();
		Arrays.sort(charOfString);
		System.out.println(String.valueOf(charOfString));

		

	}

}
