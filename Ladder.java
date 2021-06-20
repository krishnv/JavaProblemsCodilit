package Lesson13_Fibbonacci;

import java.util.Arrays;

public class Ladder {
	//https://app.codility.com/demo/results/trainingJUDTW5-2WW/	Score 100
	public static int[] solution(int[] A, int[] B) {
		long[] fib = new long[A.length + 1];
		int[] res = new int[A.length];
		int pow = 0;
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i < A.length + 1; i++) {
			fib[i] = ((fib[i - 1] + fib[i - 2])%(int)Math.pow(2, 30));
		}
		System.out.println(Arrays.toString(fib));

		for (int i = 0; i < B.length; i++) {
			pow = (int) Math.pow(2, B[i]);
			res[i] = (int) (fib[A[i]] % pow);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] A = new int[] { 4, 4, 5, 5, 1 };
		int[] B = new int[] { 3, 2, 4, 3, 1 };
		System.out.println(Arrays.toString(solution(A, B)));
	}

}
