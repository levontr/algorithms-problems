package com.levon.amazon.algorithms.sorting.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortArrayByAnagrams {
	
	public static void main(String[] args) {
		String[] str = {"abc", "dre", "bca", "der", "frt"};
		str = sortArrayByAnagrams(str);
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}
	}

	public static String[] sortArrayByAnagrams(String[] ar) {
		Map<String, LinkedList<String>> map = new HashMap<>();
		
		for(String s: ar) {
			String key = sortString(s);
			if(!map.containsKey(key)) {
				map.put(key, new LinkedList<String>());
			}
			List<String> list = map.get(key);
			list.add(s);
			
			int i = 0;
			for(String keys : map.keySet()) {
				List<String> list2 = map.get(keys);
				for(String str : list2) {
					ar[i] = str;
					i++;
				}
			}
		}
		return ar;
	}
	private static String sortString(String str) {
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		return	new String(chars);
	}
}
