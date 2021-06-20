package Lesson4_CountingValues;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FromRiverOne {
	// https://app.codility.com/demo/results/trainingY637X9-TPK/ Score-100
	public static int solution(int X, int[] A) {
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 1; i <= X; i++) {
			set.add(i);
		}
		for (int i = 0; i < A.length; i++) {
			if (set.contains(A[i])) {
				set.remove(A[i]);
				if (set.isEmpty())
					return i;
			}

		}
		return -1;
	}

	public static int solution2(int X, int[] A) {
		int[] B = new int[A.length + 1];

		for (int i = 0; i < A.length; i++) {
			B[A[i]] = 1;

			for (int j = 1; j <= X; j++) {
				if (B[j] == 1)
					continue;
				else
					break;

			}
			return i;
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 3, 2, 5, 4, 6, 5, 7 };
		int X = 5;
		System.out.println(solution(X, A));
	}

}
