package Lesson7_StackAndQueue;

import java.util.Stack;

public class Brackets {
	// https://app.codility.com/demo/results/trainingGZC96T-5KP/ Score 37
	public static int solution(String S) {
		Stack<Character> st = new Stack<>();
		int a = 0;
		for (int i = 0; i < S.length(); i++) {
			if ((S.charAt(i) == '(')) {
				st.push(S.charAt(i));
			} else if (S.charAt(i) == ')' && st.size() > 0 && st.size() % 2 != 0) {
				st.pop();
			}
			// else
			// return 0;
			if ((S.charAt(i) == '{')) {
				st.push(S.charAt(i));
			} else if (S.charAt(i) == '}' && st.size() > 0) {
				st.pop();
			}
			if ((S.charAt(i) == '[')) {
				st.push(S.charAt(i));
			} else if (S.charAt(i) == ']' && st.size() > 0) {
				st.pop();
			}
		}

		if (st.size() == 0)
			a = 1;
		else
			a = 0;
		return a;
	}
	//https://app.codility.com/demo/results/trainingCUV57H-EHG/			Score 100
	public static int solution2(String S) {
		int N = S.length();

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < N; i++) {
			if ((S.charAt(i) == '(') || (S.charAt(i) == '{') || (S.charAt(i) == '[')) {
				st.push(S.charAt(i));
			} else {
				if (st.isEmpty()) {
					return 0;
				}

				char peek = st.peek();

				if (((peek == '(') && (S.charAt(i) == ')')) || ((peek == '{') && (S.charAt(i) == '}'))
						|| ((peek == '[') && (S.charAt(i) == ']'))) {
					st.pop();
				} else {
					return 0;
				}
			}
		}

		return (st.isEmpty()) ? 1 : 0;
	}

	public static void main(String[] args) {
		// String S="{[()()]}";
		//String S = "([)()]";
		 String S="({{({}[]{})}}[]{})";
		System.out.println(solution2(S));
	}

}
