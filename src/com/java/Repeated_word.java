package com.java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeated_word {
	
	public static void main(String[] args) {
		
		String s="by the people of the people for the people";
		
		//by=
		//the=
		String[] sp = s.split(" ");
		
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		System.out.println(m);
		
		for (String str : sp) {
		if (m.containsKey(str)) {
			
			Integer num = m.get(str);
			m.put(str, num+1);
			
		}
		else {
		     m.put(str, 1);
			}
		
		}
		System.out.println(m);
		
		Set<Entry<String, Integer>> es = m.entrySet();
		for (Entry<String, Integer> entry : es) {
			System.out.println(entry);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
