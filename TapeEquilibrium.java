package Lesson3_TimeComplexity;

import java.lang.reflect.Array;

public class TapeEquilibrium {
		//https://app.codility.com/demo/results/trainingPBSJF6-HHG/	Score=46
	public static int solution(int[] A){
		int sum1=0;
		int sum2=0;
		int sum=0;
		int minSum=Integer.MAX_VALUE;
		
			for (int p = 1; p < A.length; p++) {
				for (int i = 0; i <p; i++) {
					sum1=sum1+A[i];					
				}
				for (int j = p; j <A.length; j++) {
					sum2=sum2+A[j];					
				}
				sum=Math.abs(sum1-sum2);
				if(sum<=minSum){
					minSum=sum;
					sum1=0;
					sum2=0;
					
				}
				else continue;
			}
			return minSum;
		}
	
	
		//https://app.codility.com/demo/results/trainingDV55HQ-Q7R/		Score 100
	public static int solution2(int[] A){
		int res = Integer.MAX_VALUE;
		int tmp=0;
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		for (int i = 0; i < A.length-1; i++) {
			tmp+=A[i];
			res = Math.min(res, Math.abs(tmp - (sum - tmp)));
		}
		return res;
		
	}
	
	
	
	
	public static void main(String[] args) {
		int[] A={3,1};
		System.out.println(solution(A));
	}

}
