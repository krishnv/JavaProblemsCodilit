package Lesson5_PrefixSums;

import java.util.Arrays;

public class GenomicClassQuery {
	//https://app.codility.com/demo/results/trainingRBAKEH-DXR/    	Score=62%
	public static int[] solution(String S, int[] P, int[] Q) {
		int A = 1;
		int C = 2;
		int G = 3;
		int T = 4;
		int[] min = new int[P.length];
		Arrays.fill(min, 4);
		char[] ch = new char[S.length()];
		for (int i = 0; i < S.length(); i++) {
			ch[i] = S.charAt(i);
			if (ch[i] == 'A')
				ch[i] = 1;
			if (ch[i] == 'C')
				ch[i] = 2;
			if (ch[i] == 'G')
				ch[i] = 3;
			if (ch[i] == 'T')
				ch[i] = 4;
		}

		for (int m = 0; m < P.length; m++) {
			if (P[m] == Q[m])
				min[m] = ch[P[m]];
			else
				for (int k = P[m]; k <= Q[m]; k++) {
					if (ch[k] < min[m]) {
						min[m] = ch[k];
					}
				}

		}

		return min;

	}
	//https://app.codility.com/demo/results/trainingMXCJVV-DC5/	Score 100
	public static int[] solution2(String S, int[] P, int[] Q) {
		int[] result = new int[P.length];

        int A[] = new int[S.length()+1];
        int C[] = new int[S.length()+1];
        int G[] = new int[S.length()+1];
        int T[] = new int[S.length()+1];
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == 'A')
            {
                A[i+1] = A[i]+1;
                C[i+1] = C[i];
                G[i+1] = G[i];
                T[i+1] = T[i];
            }
            else if(S.charAt(i) == 'C')
            {
                A[i+1] = A[i];
                C[i+1] = C[i]+1;
                G[i+1] = G[i];
                T[i+1] = T[i];
            }
            else if(S.charAt(i) == 'G')
            {
                A[i+1] = A[i];
                C[i+1] = C[i];
                G[i+1] = G[i]+1;
                T[i+1] = T[i];
            }
            else if(S.charAt(i) == 'T')
            {
                A[i+1] = A[i];
                C[i+1] = C[i];
                G[i+1] = G[i];
                T[i+1] = T[i]+1;
            }
        } int num_of_query = P.length; 
        for (int i = 0; i < num_of_query; i++) {
            int a = A[ Q[i] + 1] - A[ P[i] ]; 
            int c = C[ Q[i] + 1] - C[ P[i] ]; 
            int g = G[ Q[i] + 1] - G[ P[i] ];
            
            if(a > 0){ 
                result[i] = 1;
            }
            else if(c > 0){ 
                result[i] = 2;
            }
            else if(g > 0){ 
                result[i] =3;
            }
            else{ 
                result[i] =4;
            }
        }

        return result;
    }
	

	public static void main(String[] args) {
		/*
		 * String S="CAGCCTA"; int[] P={2,5,0}; int[] Q={4,5,6};
		 */
		String S = "TC";
		int[] P = { 0, 0, 1 };
		int[] Q = { 0, 1, 1 };
		System.out.println(Arrays.toString(solution2(S, P, Q)));
	}

}
