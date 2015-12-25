package com.levon.algorithms;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Tree
{
    public int x;
    public Tree l;
    public Tree r;
}


public class Test {

	public static void main(String args[]) {
		int n = 4;
		int count = 0;
		while(n>0)
		  {
		    count += n & 1;
		    n >>= 1;
		  }
		System.out.println(count);
	}

	private static int Solution(Tree T)
    {
        if (T == null)
        {
            return -1;
        }

        int count = 0;

        Stack<Map<Integer, Tree>> stack = new Stack<Map<Integer, Tree>>();
        Map<Integer, Tree> map = new HashMap<>();
        map.put(T.x, T);
        stack.push(map);

        while (stack.size() > 0)
        {
        	Map<Integer, Tree> n = stack.pop();
        	int key1 = n.keySet().iterator().next();
        	Tree tr = n.get(0);
            if (key1 <= tr.x)
            {
                ++count;
            }
            int max = Math.max(key1, tr.x);
            if (tr.l != null)
            {
            	Stack<Map<Integer, Tree>> stackL = new Stack<Map<Integer, Tree>>();
                Map<Integer, Tree> mapL = new HashMap<>();
                mapL.put(max, tr.l);
                stackL.push(mapL);
            }
            if (tr.r != null)
            {
            	Stack<Map<Integer, Tree>> stackR = new Stack<Map<Integer, Tree>>();
                Map<Integer, Tree> mapR = new HashMap<>();
                mapR.put(max, tr.r);
                stackR.push(mapR);
            }
        }

        return count;
    }



/*public static void main(String[] args) {
	int[] a = new int[]{1,3,5,3,7, 1};
	int[] b = new int[a.length];
	System.arraycopy(a, 0, b, 0, a.length);
	sort(b);

	int n = a.length;
    int temp = 0;
   boolean possible = false;
            for(int j=1; j < n; j++){

                    if(a[j-1] > a[j]){
                            //swap the elements!
                            temp = a[j-1];
                            a[j-1] = a[j];
                            a[j] = temp;
                            if(Arrays.equals(a, b)) {
                            	possible = true;
                            	break;
                            }
                            else {
                            	temp = a[j-1];
                                a[j-1] = a[j];
                                a[j] = temp;
                            	continue;
                            }


                    }
            }

}*/
		private static void sort(int[] arr ) {
	        for (int i = 1; i < arr.length; i++) {
	            int valueToSort = arr[i];
	            int j = i;
	            while (j > 0 && arr[j - 1] > valueToSort) {
	                arr[j] = arr[j - 1];
	                j--;
	            }
	            arr[j] = valueToSort;
	        }
	    }
	}

//	  public static void main(String[] args) {
//		    BigInteger numberA = new BigInteger("98765432123456789");
//		    BigInteger numberB = BigInteger.TEN;
//
//		    numberA = numberA.remainder(numberB);
//		    System.out.println("numberA = " + numberA);
//
//		    numberA = numberA.add(numberB);
//		    System.out.println("numberA = " + numberA);
//
//		    numberA = numberA.multiply(numberB);
//		    System.out.println("numberA = " + numberA);
//
//		    numberA = numberA.subtract(numberB);
//		    System.out.println("numberA = " + numberA);
//
//		    numberA = numberA.divide(numberB);
//		    System.out.println("numberA = " + numberA);
//
//		    numberA = numberA.mod(numberB);
//		    System.out.println("numberA = " + numberA);
//
//		    numberA = numberA.remainder(numberB);
//		    System.out.println("numberA = " + numberA);
//
//		    numberA = numberA.negate();
//		    System.out.println("numberA = " + numberA);
//	  }

//}
//abstract class Animal { }
//
//class Dog extends Animal {
//    String name;
//
//    Dog(String name) {
//        this.name = name;
//    }
//
//    String getName() {
//        return name;
//    }
//}
//
//class Cat extends Animal {
//    String name;
//
//    Cat(String name) {
//        this.name = name;
//    }
//
//    String getName() {
//        return name;
//    }
//}
//
//class Application {
//
//    static String getAnimalName(Animal a) {
//        String name = null;
//        if (a instanceof Dog) {
//            name = ((Dog) a).getName();
//        } else if (a instanceof Cat) {
//            name = ((Cat) a).getName();
//        }
//
//        return name;
//    }
//}