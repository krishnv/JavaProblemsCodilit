package Lesson1_Iterations;
//https://app.codility.com/demo/results/trainingHYQSRA-GBP/		score=100
public class BinaryGap {

	public static int solution(int N) {
		int temp = 0; // temp gap
		int max = 0; // max gap
		String s = Integer.toBinaryString(N);
		System.out.println(s);
		int pos = s.indexOf('0');
		System.out.println(pos);
		if (pos < 0)
			return max;
		for (int i = pos; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				temp++;

			} else {
				if (temp> max)
					max = temp;
				;
				temp = 0;
			}
		}

		return max;

	}

	public static void main(String[] args) {
		System.out.println(BinaryGap.solution(15));
	}

}
