package Lesson13_Fibbonacci;

import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FibFrog {
	public static int solution(int[] A) {
		int n = A.length+1;
		if (n < 1)
			return -1;

		List<Integer> fibser = new ArrayList<Integer>();
		fibser.add(0);
		fibser.add(1);
		int i = 2;
		while (fibser.get(fibser.size() - 1) <= n) {
			fibser.add(fibser.get(i - 1) + fibser.get(i - 2));
			i++;
		}
		// System.out.println(fibs);
		fibser.remove(0);
		fibser.remove(1);
		Collections.reverse(fibser);
		fibser.remove(0);
		System.out.println(fibser);

		int steps = 0, pos = 0;
		int bank = A.length;
		int jump = -1;
		for (int i1 = 0; i1 < A.length; i1++) {
			if (A[i1] == 1) {
				pos++;
			}

			while (jump < A.length) {
				for (int j = 1; j < fibser.size(); j++) {

					if (jump + fibser.get(j) == n) {
						jump = jump + fibser.get(j);
						steps++;
						break;
					}
					if ((A[jump + fibser.get(j)] == 1)&&(jump + fibser.get(j)<A.length)) {
						jump = jump + fibser.get(j);
						steps++;
						
						
					} else
						continue;

				}
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] A = { 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0 };
		System.out.println(solution(A));
	}

}
