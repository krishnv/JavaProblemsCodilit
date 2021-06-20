package Lesson8_Leader;

import java.util.Stack;

public class Dominator {
	//https://app.codility.com/demo/results/trainingJBERE8-KT3/		Score 100 
	public static int solution(int[] A) {
		Stack<Integer> st = new Stack<>();
		int candidate = 0;
		int num = 0;
		int index = 0;

		for (int i = 0; i < A.length; i++) {
			if (st.isEmpty())
				st.push(A[i]);
			else if (A[i] == st.peek())
				st.push(A[i]);
			else
				st.pop();
		}

		if (st.isEmpty())
			return -1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] == st.peek()) {
				candidate = st.peek();
				index = i;
				num++;

			}
		}
		if (num > A.length / 2)
			return index;
		return -1;

	}

	public static void main(String[] args) {
		int[] A = { 3, 4, 3, 2, 3, -1, 3, 3 };
		System.out.println(solution(A));
	}

}
