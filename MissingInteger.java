package Lesson4_CountingValues;

import java.util.Arrays;

public class MissingInteger {

	//https://app.codility.com/demo/results/training923V87-Q95/	//Score-100
	public static int solution(int[] A) {
		int[] B = new int[10000000];

		for (int i = 0; i < A.length; i++) {
			if (A[i] < 0)
				continue;
			B[A[i]] = 1;
		}
		for (int i = 1; i < 1000000; i++) {
			if (B[i] == 0)
				return i;
		}
		return 1;
	}
	//Score 100
		public static int solution1(int[] A) {
			Arrays.sort(A);
			int res =  1;
			
			for (int i: A)
				if (i == res)
					res++;
			
			return res;
					
		
			
		}
		
		
	public static void main(String[] args) {
		//int[] A = { 1,2,3,4,5,6,0,7,8,9 };
		int[]A={1,2,3,1};
		System.out.println(solution1(A));
	}

}
