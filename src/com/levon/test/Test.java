package com.levon.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		 String[] pointss = {"A,-1,0", "B,0,1", "C,1,2", "D,1,-2", "E,-2,-1"};
		 maxPoints(pointss);
	}
	
	public static int maxPoints(String[] pointsString) {
		String[][] points = new String[pointsString.length][];
		for (int i = 0; i < points.length; i++) {
			points[i] = pointsString[i].split(",");
		}
	    if(points == null || points.length == 0) return 0;
	 
	    HashMap<Double, String> result = new HashMap<Double, String>();
	    int max=0;
	 
	    for(int i=0; i<points.length; i++){
	        
	        for(int j=i+1; j<points.length; j++){
	           
	                double slope = points[j][2] == points[i][2] ? 0.0
					        : (1.0 * (Double.parseDouble(points[j][2]) - Double.parseDouble(points[i][2])))
							/ (Double.parseDouble(points[j][1]) - Double.parseDouble(points[i][1]));
	 
	                if(result.get(slope) != null){
	                    result.put(slope, result.get(slope) + points[j][0]);
	                }else{
	                    result.put(slope, points[j][0]);
	                }
	            
	        }
	 

	      
	    }
	    List<String> res = new ArrayList<>();
	    for (int i = 0; i < result.size(); i++) {
			if(result.get(i).length()>1) {
				res.add(result.get(i));
			}
		}
	 
	    return max;
	}
}
