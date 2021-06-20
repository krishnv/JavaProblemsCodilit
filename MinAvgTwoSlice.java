package Lesson5_PrefixSums;

import java.util.Arrays;

public class MinAvgTwoSlice {
	// https://app.codility.com/demo/results/trainingCJGDXU-PWN/ Score=100
	public static int solution(int[] A) {
		int n = A.length;

		double min = (A[0] + A[1]) / 2;
		double slice = 0;
		int index = 0;
		for (int j = 0; j < A.length - 2; j++) {
			slice = Math.min((A[j] + A[j + 1]) / 2.0, (A[j] + A[j + 1] + A[j + 2]) / 3.0);
			if (slice < min) {
				min = slice;
				index = j;
			}
			if (((A[n - 2] + A[n - 1]) / 2) < min)
				index = n - 2;

		}
		return index;
	}

	public static void main(String[] args) {
		int[] A = { 4, 2, 2, 5, 1, 5, 8 };
		System.out.println(solution(A));
	}

}
