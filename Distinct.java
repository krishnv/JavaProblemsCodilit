package Lesson6_Sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Distinct {
	// https://app.codility.com/demo/results/training4KV5C6-2XS/ Score100
	public static int solution(int[] A) {

		Arrays.sort(A);
		int dup = 0;
		for (int i = 1; i < A.length; i++) {
			if (A[i] == A[i - 1])
				dup++;
		}
		return A.length - dup;

	}
	
	 public int solution1(int[] A) {
	      Set<Integer> st= new HashSet<>();
	      for(int i=0;i<A.length;i++){
	          st.add(A[i]);
	      }
	      return st.size();
	    }

	public static void main(String[] args) {
		int[] A = new int[] { 2, 1, 1, 2, 3, 1 };
		System.out.println(solution(A));

	}

}
