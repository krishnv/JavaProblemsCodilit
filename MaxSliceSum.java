package Lesson9_MaximumSliceProblem;

public class MaxSliceSum {
	
	public static int solution(int[] A) {
        int maxSoFar=Integer.MIN_VALUE;
        int maxEnd=Integer.MIN_VALUE;
        
        for (int i = 1; i < A.length; i++) {
			if(A[i]+A[i-1]>A[i])
				A[i]=A[i]+A[i-1];
		}
    
	 int max=A[0];
	for (int i = 1; i < A.length; i++) {
		if(max<A[i])
			max=A[i];
	}
	return max;
	}
			//https://app.codility.com/demo/results/training4CA5FE-PCT/		Score=100
	public static int solution2(int[] A){
		int maxSoFar=A[0];
		int max=A[0];
		
		for (int i = 1; i < A.length; i++) {
			max=Math.max(A[i], max+A[i]);
			maxSoFar=Math.max(max, maxSoFar);
		}
		return maxSoFar;
		
		
	}
	public static void main(String[] args) {
		int[] A={3,2,-6,4,0};
		System.out.println(solution2(A));

	}

}
