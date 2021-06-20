package Lesson10_PrimeAndComposite;

import java.util.ArrayList;
import java.util.List;

public class Peaks {
	public static int solution(int[] A) {
		List<Integer> peakindex = new ArrayList<Integer>();
		int blocks = 0, count = 0;
		for (int i = 1; i < A.length; i++) {
			if ((A[i] > A[i - 1]) && (A[i] > A[i + 1]))
				peakindex.add(i);
			count++;
		}
		for (int j = 1; j < A.length; j++) {
			blocks = A.length / j;
			if (A.length % j != 0 || blocks > count) {
				continue;
			}

			boolean ok = true;
			int threshold = 0;
			for (int i = 0; i < peakindex.size(); i++) {
				if (peakindex.get(i) / j > threshold) {
					ok = false;
					break;
				}
				if (peakindex.get(i) / j == threshold)
					threshold++;
			}

			if (threshold != blocks)
				ok = false;
			if (ok)
				return blocks;
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2 };
		System.out.println(solution(A));

	}

}
