package Lesson6_Sorting;

import java.util.Arrays;

public class NumberOfDiscIntersections {
	// https://app.codility.com/demo/results/trainingFQQV4U-4QS/ Score:62
	public static int solution(int[] A) {
		long[] left = new long[A.length];
		long[] right = new long[A.length];
		int count = 0;

		for (int i = 0; i < A.length; i++) {
			left[i] = i - (long) A[i];
			right[i] = i + (long) A[i];
		}
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (right[i] >= left[j]) {
					count++;
				}
			}
		}

		return count;
	}
	
	//https://app.codility.com/demo/results/trainingAEEVUT-4VD/			Score 100
	public static int solution2(int[] A) {
		long[] left = new long[A.length];
		long[] right = new long[A.length];
		int count = 0;
			
		for (int i = 0; i < A.length; i++) {
			left[i] = i - (long) A[i];
			right[i] = i + (long) A[i];
		}
		Arrays.sort(left);
		Arrays.sort(right);
		System.out.println("Left " + Arrays.toString(left));
		System.out.println("Right " + Arrays.toString(right));
		int j = 0;
		for (int i = 0; i < A.length; i++) {										//75% if follow commented steps	
																					//j=i+1;
			while (j < A.length && right[i] >= left[j]) {
				count += j;															//count += 1;
				count -= i;															//	
				j++;

			}
		}
		if(count > 10000000)
            return -1;
		
		return count;
	}

	public static void main(String[] args) {
		int[] A = { 1, 5, 2, 1, 4, 0 };
		System.out.println(solution2(A));

	}

}
