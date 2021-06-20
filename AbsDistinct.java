package Lesson15_CatterPilarMethod;

import java.util.HashSet;
import java.util.Set;

public class AbsDistinct {
	//app.codility.com/demo/results/trainingBN63F3-83Q/		Score 100
	public static int solution(int[] A){
		Set<Integer> dis=new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			if(A[i]<0){
				A[i]=Math.abs(A[i]);
				dis.add(A[i]);
				}
			dis.add(A[i]);
		}
		return dis.size();
	}
	public static void main(String[] args) {
		int[]A={-5,-3,-1,0,3,6};
		System.out.println(solution(A));
	}

}
