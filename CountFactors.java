package Lesson10_PrimeAndComposite;

public class CountFactors {
	//https://app.codility.com/demo/results/trainingYD7PNK-64N/		Score 100
	public static int solution(int N) {
        long i = 1;
		int res = 0;
		if(N==1)
			return 1;
		while (i * i < N) {
			if (N % i == 0) {
				res += 2; // n and n/a
			}
			i += 1;

			if (i * i == N) {
				res += 1;
			}
		}
		return res;
    }
	public static void main(String[] args) {
		int A=64;
		System.out.println(solution(A));

	}

}
