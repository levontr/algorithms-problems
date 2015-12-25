package com.levon.algorithms;

import javax.print.attribute.standard.Fidelity;

public class FindSubstringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] largeArray = new int[]{1,2,3,6,4,5,3,4,89};
		int[] subArray = new int[]{3,4,1,89};
	//	System.out.println(isSubstring(largeArray, subArray));

		char[] firstStr = "abcde".toCharArray();
		char[] secondStr = "efg".toCharArray();
		subString(firstStr, 0, firstStr.length, secondStr, 0, secondStr.length, 0);

		findMe("efg", "abcdefg");
	}

	public static boolean isSubstring(int[] largeArray, int[] subArray) {

		if (largeArray.length == 0 || subArray.length == 0) {
			return false;
		}
		if (largeArray.length < subArray.length) {
			return false;
		}
		startOver: for (int i = 0; i < largeArray.length; i++) {
			if (largeArray[i] == subArray[0]) {
				int k = i + 1;
				for (int j = 1; j < subArray.length; j++) {
					if (k < largeArray.length) {
						if (largeArray[k] != subArray[j]) {
							continue startOver;
						} else {
							k++;
						}
					} else {
						return false;
					}

				}
				return true;
			}
		}
		return false;

	}

	 static int subString(char[] source, int sourceOffset, int sourceCount,
	            char[] target, int targetOffset, int targetCount,
	            int fromIndex) {
	        if (fromIndex >= sourceCount) {
	            return (targetCount == 0 ? sourceCount : -1);
	        }
	        if (fromIndex < 0) {
	            fromIndex = 0;
	        }
	        if (targetCount == 0) {
	            return fromIndex;
	        }

	        char first = target[targetOffset];
	        int max = sourceOffset + (sourceCount - targetCount);

	        for (int i = sourceOffset + fromIndex; i <= max; i++) {
	            /* Look for first character. */
	            if (source[i] != first) {
	                while (++i <= max && source[i] != first);
	            }

	            /* Found first character, now look at the rest of v2 */
	            if (i <= max) {
	                int j = i + 1;
	                int end = j + targetCount - 1;
	                for (int k = targetOffset + 1; j < end && source[j]
	                        == target[k]; j++, k++);

	                if (j == end) {
	                    /* Found whole string. */
	                    return i - sourceOffset;
	                }
	            }
	        }
	        return -1;
	    }

	 public static boolean findMe(String subString, String mainString) {
	        boolean foundme = false;
	        int max = mainString.length() - subString.length();

	        // Java's Default "contains()" Method
	        System.out.println(mainString.contains(subString) ? "mainString.contains(subString) Check Passed.."
	                : "mainString.contains(subString) Check Failed..");

	        // Implement your own Contains Method with Recursion
	        checkrecusion: for (int i = 0; i <= max; i++) {
	            int n = subString.length();

	            int j = i;
	            int k = 0;

	            while (n-- != 0) {
	                if (mainString.charAt(j++) != subString.charAt(k++)) {
	                    continue checkrecusion;
	                }
	            }
	            foundme = true;
	            break checkrecusion;
	        }
	        System.out
	        .println(foundme ? "\nImplement your own Contains() Method - Result: Yes, Match Found.."
	                : "\nImplement your own Contains() Method - Result:  Nope - No Match Found..");
	        return foundme;
	    }
}

