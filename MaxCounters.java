package Lesson4_CountingValues;

import java.util.Arrays;
import java.util.Collections;

public class MaxCounters {
	// https://app.codility.com/demo/results/trainingWZ8XUJ-VCB/ Score =44%
	public static int[] solution(int N, int[] A) {
		int[] B = new int[N];
		for (int i = 0; i < A.length; i++) {
			if (A[i] >= N) {
				int max = 0;
				for (int j = 1; j < B.length; j++)
					if (B[j] > max)
						max = B[j];

				Arrays.fill(B, max);
			} else
				B[A[i] - 1]++;
		}
		return B;

	}
	
	//https://app.codility.com/demo/results/trainingZ9BQR5-62F/			Score=100
	public static int[] solution2(int N, int[] A){	
	int max=0;
	int min=0;
	int[] B = new int[N];
	
	for (int i = 0; i < A.length; i++) {
		if(A[i]<=N){
			  if(B[ A[i] -1] < min){
                  B[ A[i] -1] = min; 
              }
              
              B[ A[i] -1 ] ++; 
              
              if( B[ A[i] -1 ] > max){ 
                  max = B[ A[i] -1 ];
              }}
		else if( A[i] == N+1){  
			min=max;}
		}
	for(int j=0; j<B.length; j++){
        if(B[j] < min){
            B[j] = min; 
        }
    }
    
    return B;
		
	}

	


	public static void main(String[] args) {
		int[] A = { 3, 4, 4, 6, 1, 4, 4 };
		int N = 5;
		System.out.println(Arrays.toString(solution2(N, A)));
	}

}
