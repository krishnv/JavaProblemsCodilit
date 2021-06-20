package Lesson16_Greedy;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MaxNonOverLappingSeg {
	//https://app.codility.com/demo/results/trainingTZ7T53-AJC/	Score100
	public int solution(int[] A, int[] B){
		int n=A.length,count=0;
		Stack<Integer> st=new Stack<>();
		for (int i = 0; i < B.length; i++) {
			if(st.isEmpty()){
				st.add(B[i]);
			}
			if(st.peek()<A[i])
				st.add(B[i]);
		}
		return st.size();
	}
	public static void main(String[] args) {
		int[]A={1,3,7,9,9};
		int []B={5,6,8,9,10};
		System.out.println(new MaxNonOverLappingSeg().solution(A, B));

	}

}
