package Lesson7_StackAndQueue;

import java.util.Stack;

public class Nesting {
	// https://app.codility.com/demo/results/training5M9SAD-8VX/ Score=100
	public static int solution(String S) {
		Stack<Character> st = new Stack<>();
		int a = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(') {
				st.push(S.charAt(i));
			} else if (S.charAt(i) == ')' && st.size() > 0) {
				st.pop();
			} else
				return 0;
		}

		if (st.size() == 0)
			a = 1;
		else
			a = 0;
		return a;
	}

	public static int solution2(String S) {
		int N = S.length();
		int counter = 0;

		for (int i = 0; i < N; i++) {
			if (S.charAt(i) == '(') {
				counter++;
			} else if (S.charAt(i) == ')') {
				if (--counter < 0) {
					return 0;
				}
			}
		}

		return ((counter == 0) ? 1 : 0);
	}

	public static void main(String[] args) {
		// String S = "((()()))";
		String S = "( )))((";
		System.out.println(solution(S));

	}

}
