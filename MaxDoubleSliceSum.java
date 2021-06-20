package Lesson9_MaximumSliceProblem;

public class MaxDoubleSliceSum {
	//https://app.codility.com/demo/results/trainingCGSB8S-VA5/	Score100
	 public static int solution(int[] A){
		 int[] B=new int[A.length];
		 int[] C=new int[B.length];
		 int max=0;
		 for (int i = 1; i < A.length-1; i++) {
			B[i]=Math.max(B[i-1]+A[i],0);
		}
		 for (int i = A.length-2; i>0; i--) {
			C[i]=Math.max(A[i]+C[i+1], 0);
		}
		 for (int i = 1; i < A.length-1; i++) {
			max=Math.max(max,B[i-1]+C[i+1]);
		}
		 return max;
	 }
	
	
	public static void main(String[] args) {
		int[] A = new int[]{3,2,6,-1,4,5,-1,2};
		System.out.println(solution(A));
	}

}
