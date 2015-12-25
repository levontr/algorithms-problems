package com.levon.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubStringOld {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		System.out.print("Enter The Main String: ");
		InputStreamReader inputReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputReader);
		String mainString = br.readLine();
		System.out.print("Enter The Sub String: ");
		String subString = br.readLine();
		System.out.println(isSubstring(subString, mainString));
		inputReader.close();
		br.close();

	}

	public static boolean isSubstring(String mainString, String subString) {
		boolean found = false;

		CHECFROMNEXT: for (int i = 0; i < mainString.length(); i++) {
			int n = subString.length();

			int j = i;
			int k = 0;

			REGEXHIT: while (n-- != 0 && j<mainString.length()) {
				if (mainString.charAt(j) != subString.charAt(k)) {
					// if each of the next elements from main and sub strings are not equal
					// check should be done for regex ('\n') otherwise start iterate from next element in mainstring
					if (subString.charAt(k) == '\\') {
						if (k + 1 < subString.length()	&& subString.charAt(k + 1) == '*') {
							// if there is no element in substring after regex - return true
							if (k + 2 >= subString.length()) {
								found = true;
								break;
							} else {
								// find if there is an element after '\*' regex and iterate over mainstring to match that element
								char nextToRegEx = subString.charAt(k + 2);
								while (j < mainString.length()) {
									if (mainString.charAt(j) == nextToRegEx) {
										j++;
										k = k + 3;
										n = n - 2;
										if (k >= subString.length()) {
											found = true;
											break;
										}
										continue REGEXHIT;
									}
									j++;
								}
							}

						}
					}
					continue CHECFROMNEXT;
				}
				j++;
				k++;
			}
			found = true;
			break CHECFROMNEXT;
		}
		return found;
	}

}