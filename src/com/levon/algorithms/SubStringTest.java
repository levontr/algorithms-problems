package com.levon.algorithms;

import java.util.ArrayList;

public class SubStringTest {

	/**
	 * @param args
	 */



public static void main (String[] args) {
	if(args.length == 0) {
		System.out.println("there is no imput from user");
	}
	
	int count=4;
	int res = 1;
	for(int i = 1; i <= count; i++) {
		
        res = res*i;
    }int res2=1;
	for(int i = 1; i <= count-2; i++) {
		res2=res2*i;
	}
	System.out.println( res/res2);
		
}
}