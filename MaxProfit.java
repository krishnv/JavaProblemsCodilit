package Lesson9_MaximumSliceProblem;

public class MaxProfit {
	// https://app.codility.com/demo/results/trainingYG5QD3-3TB/ Score=66
	public static int solution(int[] A) {
		long profit = 0, max = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] < A[j])
					profit = A[j] - A[i];
				if (max < profit)
					max = profit;
			}
		}
		return (int) max;
	}

	// https://app.codility.com/demo/results/trainingZ9Y97M-WE7/ Score 77%
	public static int solution2(int[] A) {
		long profit = 0, max = 0;
		int index = 0, min = Integer.MAX_VALUE;
		if (A.length == 0)
			return 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] < min) {
				min = A[i];
				index = i;
			}
		}
		for (int j = index + 1; j < A.length; j++) {
			if (A[index] < A[j])
				profit = A[j] - A[index];
			if (max < profit)
				max = profit;
		}

		return (int) max;
	}

	// https://app.codility.com/demo/results/trainingS84GF8-A9Y/ Score=100
	public static int solution3(int[] A) {
		long max = 0;

		if (A.length <= 0)
			return 0;
		int min = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i] < min)
				min = A[i];
			else {
				if (A[i] - min > max)
					max = A[i] - min;

			}
		}

		return (int) max;
	}
	public static int solution4(int[] A) {
	int maxProfit = 0;
    int dayMin = Integer.MAX_VALUE;
    
    for(int a: A){
        dayMin = Math.min(dayMin, a);
        maxProfit = Math.max(maxProfit, a-dayMin);
    }
    return maxProfit;
	}
	
	public static void main(String[] args) {
		// int[] A={3,5,7,2,9,11};
		// int[] A = { 23171, 21011, 21366, 21013, 21367 };
		// int[] A={8, 9, 3, 6, 1, 2};
		int[] A = {};
		System.out.println(solution4(A));

	}

}
