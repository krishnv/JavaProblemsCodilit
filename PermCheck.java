package Lesson4_CountingValues;

import java.util.Arrays;

public class PermCheck {
	//https://app.codility.com/demo/results/training6ZP2YN-49M/		Score=100
	public static int solution(int[] A){
		int n=A.length;
		Arrays.sort(A);
		if(A[0]!=1)
			return 0;
		for(int i=0;i<n-1;i++){
			if(A[i]+1!=A[i+1])
				return 0;
			
		}
		return 1;
	
	
	
	}
	
	public static void main(String[] args) {
		int A[]={4,1,2,3};
		System.out.println(solution(A));
	}

}
