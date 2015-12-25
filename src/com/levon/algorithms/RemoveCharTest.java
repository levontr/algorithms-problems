package com.levon.algorithms;

public class RemoveCharTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "1234ghfh5678";
		System.out.println("String before char remove - "+str);
		System.out.println("String before char remove - "+removeChar(str, 'h'));

	}
	public static String removeChar(String str, char ch) {
		if(str.equals(null)) {
			throw new RuntimeException();
		}
		char[] chars = str.toCharArray();
		StringBuilder strBuilder = new StringBuilder();
		for(int i=0; i<chars.length; i++) {
			if(chars[i] == ch) {
				continue;
			}
			else{
				strBuilder.append(chars[i]);
			}
		}
		return strBuilder.toString();
	}

}
