package Lesson11_SieveOfEratosthenes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://app.codility.com/demo/results/trainingSC983U-3DB/	Score100 
public class CountSemiPrimes {
	public static int[] solution(int N, int[] P, int[] Q) {
		int[] result = new int[P.length];
		int[] F = new int[N + 1];
		int i = 2, k = 0;
		while (i * i <= N) {
			if (F[i] == 0) {
				k = i * i;
				while (k <= N) {
					if (F[k] == 0) {
						F[k] = 1;
					}
					k += i;
				}
			}
			i += 1;
		}

		int[] F2 = new int[N + 1];

		for (i = 2; i * i <= N; i++) {
			for (k = i; k <= N; k++) {
				if (F[i] == 0) {
					if (F[k] == 0)
						if (i * k <= N)
							F2[i * k] = 1;
				}
			}
		}
		// System.out.println(Arrays.toString(F2));

		int[] prefix = new int[N + 1];

		for (i = 1; i < prefix.length; i++) {
			prefix[i] = prefix[i - 1] + F2[i];
		}

		// System.out.println(Arrays.toString(prefix));

		for (i = 0; i < P.length; i++) {
			result[i] = prefix[Q[i]] - prefix[P[i] - 1];
		}

		return result;
	}

	public static void main(String[] args) {
		int[] A = new int[] { 1, 4, 16 };
		int[] B = new int[] { 26, 10, 20 };
		int N = 26;
		System.out.println(Arrays.toString(solution(N, B, A)));

	}

}
