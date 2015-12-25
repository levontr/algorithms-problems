package com.levon.algorithms.dynamicprogramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

public class JobSchedulingProblem {
	
	public static void main(String[] args) {
		Job jobs[] = new Job[6];
        jobs[0] = new Job(1,3,5);
        jobs[1] = new Job(2,5,6);
        jobs[2] = new Job(4,6,5);
        jobs[3] = new Job(6,7,4);
        jobs[4] = new Job(5,8,11);
        jobs[5] = new Job(7,9,2);
        //jobs[6] = new Job(8,12,8);
        maximizeDynamic2(jobs);
	}
	public static int maximizeDynamic(Job[] jobs) {
		FinishTimeComparator finishTimeComparator = new FinishTimeComparator();
		Arrays.sort(jobs, finishTimeComparator);
		
		int[] T = new int[jobs.length];
		T[0] = jobs[0].profit;
		for (int i = 1; i < jobs.length; i++) {
			T[i] = jobs[i].profit;
			for (int j = 0; j < i; j++) {
				if(jobs[j].end <= jobs[i].start) {
					T[i] = Math.max(T[i], jobs[i].profit+T[j]);
					//break;
				}
				
			}
		}
		return 0;
	}
	public static int maximizeDynamic2(Job[] jobs){
        int T[] = new int[jobs.length];
        FinishTimeComparator comparator = new FinishTimeComparator();
        Arrays.sort(jobs, comparator);
        
        T[0] = jobs[0].profit;
        for(int i=1; i < jobs.length; i++){
            T[i] = Math.max(jobs[i].profit, T[i]);
            for(int j=i-1; j >=0; j--){
                if(jobs[j].end < jobs[i].start){
                    T[i] = Math.max(T[i], jobs[i].profit + T[j]);
                    break;
                }
            }
        }
        return T[jobs.length-1];
	}
	}


class Job{
    int start;
    int end;
    int profit;
    Job(int start,int end,int profit){
        this.start= start;
        this.end = end;
        this.profit= profit;
    }
}

class FinishTimeComparator implements Comparator<Job>{

    @Override
    public int compare(Job arg0, Job arg1) {
        if(arg0.end <= arg1.end){
            return -1;
        }else{
            return 1;
        }
    }
}