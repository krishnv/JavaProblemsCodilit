package Lesson7_StackAndQueue;

import java.util.Stack;

public class StoneWall {
	//https://app.codility.com/demo/results/trainingDJ8EXA-UGA/			Score=100
	public static int solution(int[] H) {
		Stack<Integer> st = new Stack<>();
		int n = 0;
		for (int i = 0; i < H.length; i++) {
			while (!(st.isEmpty()) && H[i] < st.peek()) {
				st.pop();

			}
			if (st.isEmpty()) {
				n++;
				st.push(H[i]);
			} else if (H[i] == st.peek())
				continue;

			else if (H[i] > st.peek()) {
				st.push(H[i]);
				n++;
			}

		}
		return n;
	}

	public static void main(String[] args) {
		int[] H = { 8, 8, 5, 7, 9, 8, 7, 4, 8 };
		System.out.println(solution(H));
	}

}
