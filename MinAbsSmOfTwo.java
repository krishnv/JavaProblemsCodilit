package Lesson15_CatterPilarMethod;

import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

public class MinAbsSmOfTwo {
	// https://app.codility.com/demo/results/trainingD3BB6T-ADW/ Score 100
	public static int solution(int[] A) {
		int n = A.length;
		long sum = 0, minSum = Long.MAX_VALUE;
		if (n == 1)
			return Math.abs(2 * A[0]);
		Arrays.sort(A);
		if (A[0] >= 0)
			return Math.abs(2 * A[0]);
		else if (A[0] <= 0 && A[n - 1] <= 0)
			return Math.abs(2 * A[n - 1]);

		for (int i = 0; i < n; i++) {
			int j = n - 1;
			while (j >= i) {
				sum = Math.abs(A[i] + A[j]);
				if (sum == 0)
					return 0;
				minSum = Math.min(minSum, sum);

				if (Math.abs(A[i]) >= Math.abs(A[j]))
					i++;
				else
					j--;

			}
			if (A[i] > 0)
				break;
		}

		return (int) minSum;
	}

	public static void main(String[] args) {
		// int[]A={1,4,-3};
		int[] A = { -8, 4, 5, -10, 3 }; //-10 -8 3 4 5

		System.out.println(solution(A));
	}

}
