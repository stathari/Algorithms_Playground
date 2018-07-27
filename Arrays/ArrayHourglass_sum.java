/* question 
 * given 2d array find the max sum of a hourglass in the array.
-9 -9 -9  1 1 1 
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
 * 
 hour glass def (above array with max sum)
0 4 3
  1
8 6 6
 * 
 * */
package com.algorithms;

public class ArrayHourglass_sum {
	static int hourglassSum(int[][] arr) {
		int sum  = Integer.MIN_VALUE;
		for(int i =0;i<4;i++){
			for(int j=0;j<4;j++){
				int l=i,m=j,temp = 0, check =m+3;

				while(m<check){
					temp =  temp + arr[l][m]; //first row
					m++;
				}
				m = j;
				l = i;
				temp =  temp + arr[l+1][m+1];
				l = i+2;
				while(m < check){
					temp =  temp + arr[l][m]; //first row
					m++;
				}
				if (temp > sum){
					sum = temp;
				}


			}
		}
		return sum;
	}

	public static void main(String [] args){
		int[][] arr={{1,1,1,0,0,0},
				{0,1,0,0,0,0},
				{1,1,1,0,0,0},
				{0,0,2,4,4,0},
				{0,0,0,2,0,0},
				{0,0,1,2,4,0}};
		System.out.print(hourglassSum(arr));

	}

}
