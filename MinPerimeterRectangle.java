package Lesson10_PrimeAndComposite;

public class MinPerimeterRectangle {
	//https://app.codility.com/demo/results/trainingBAF7XP-35P/		Score 100
	public static int solution(int N) {
		int min = Integer.MAX_VALUE;
		for (int i = 1; i*i <= N; i++) {
			if (N % i == 0) 
				min = 2*(i+N/i)<min?2*(i+N/i):min;
		}
		return min;
	}
    
	public static void main(String[] args) {
		System.out.println(solution(30));

	}

}
