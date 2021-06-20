package Lesson3_TimeComplexity;

public class PermMissingElement {
	//https://app.codility.com/demo/results/trainingSX79TZ-AT4/			Score=100
	public static int solution(int[] A){
		int[] B = new int[A.length+2];
		for (int i = 0; i < A.length; i++) {
			B[A[i]] = 1;
		}
		for (int i = 1; i < B.length; i++) {
			if (B[i] == 0)
				return i;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int[] A={1,2,3,4,6,7,8,9,10};
		System.out.println(solution(A));
	}

}
