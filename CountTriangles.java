package Lesson15_CatterPilarMethod;

import java.util.Arrays;

public class CountTriangles {
	//https://app.codility.com/demo/results/trainingR9H9TS-ZNG/		Score100
	public static int triangles(int []A){
		int res=0;
		if (A.length< 3)
			return 0;
		int front;
		Arrays.sort(A);
		for (int i = 0; i < A.length-2; i++) {
			front = i+2;
			for (int j = i+1; j < A.length-1; j++) {
				while(front < A.length && A[i] + A[j] > A[front]){
					front++;
				}
				res+=front-j-1;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[]A={10,2,5,1,8,12};
		System.out.println(triangles(A));

	}

}
