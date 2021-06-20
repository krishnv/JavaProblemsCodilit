package Lesson5_PrefixSums;

public class PassingCars {
// https://app.codility.com/demo/results/trainingHZ7Z9R-Q5A/			Score=100
	public static int solution(int[] A){
		
		int res = 0;
		int ones = 0;
		for (int i = A.length-1; i >= 0; i--) {
			if (A[i] == 1)
				ones++;
			else {
				res += ones;
				if (res > 1000000000)
					return -1;
			}
		}
		return res;
	}
	
	
	
	public static void main(String[] args) {
	int[] A={0,1,0,0,1,1};
	System.out.println(solution(A));
		
		
	}

}
