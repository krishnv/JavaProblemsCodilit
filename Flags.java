package Lesson10_PrimeAndComposite;

import java.util.ArrayList;
import java.util.List;

public class Flags {
	//https://app.codility.com/demo/results/training3Z2NWP-QM7/		Score 33  C->62	P->0
	public static int solution(int[] A) {
		int N=A.length;
		List<Integer> peak = new ArrayList<Integer>();
		int blocks = 0, count = 0;
		for (int i = 1; i < A.length; i++) {
			if ((A[i] > A[i - 1]) && (A[i] > A[i + 1]))
				peak.add(i);
			count++;
		}
		
		int[] next = new int[N];
		next[N-1] = -1;
		for (int i = N-2; i > -1; i--) {
			if(peak.contains(i))
				next[i] = i;
			else
				next[i] = next[i+1];
		}
		int i = 1;
		int result = 0;
		while ((i-1)*i <= N) {
			int pos = 0;
			int num = 0;
			while (pos < N && num < i) {
				pos = next[pos];
				if (pos == -1)
					break;
				num += 1;
				pos += i;
			}
			result = Math.max(result, num);
			i++;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
