/*
 left shift array by number of indices
 1 2 3 4 5 shift 4 gives
 5 1 2 3 4
 * 
 * */

package com.algorithms;

public class Shift_Array {
	 static int[] rotLeft(int[] a, int d) {
	        int temp = 0,swap =0, len= a.length;
	        for(int i=0;i<d;i++){
	            temp = a[0];
	            for (int j=0;j<len-1;j++){
	                swap = a[j];
	                a[j] = a[j+1];
	                a[j+1] = swap;
	            }
	            a[len-1] = temp;
	        }
	        return a;
	    }
	 public static void main(String[] args){
		 int [] arr = {1,2,3,4,5};
		 int [] res = rotLeft(arr,4);
		 for(int i: arr){
		 System.out.println(i);}
	 }
}
