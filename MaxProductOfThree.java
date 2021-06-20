package Lesson6_Sorting;

import java.util.Arrays;

public class MaxProductOfThree {
	//https://app.codility.com/demo/results/trainingBQCYPG-8CP/    	Score 100
	public static int solution(int[] A){
		Arrays.sort(A);
		int N=A.length;
		int max1=A[N-1]*A[N-2]*A[N-3];
		int max2=A[0]*A[1]*A[N-1];		
		return Math.max(max1, max2);
	}



	public static void main(String[] args) {
		int[] A={-3,1,2,-2,5,6};
		System.out.println(solution(A));

	}

}
