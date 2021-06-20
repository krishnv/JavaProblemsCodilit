package Lesson17_DynamicProgramming;

import java.util.Arrays;
import java.util.Stack;

public class NumberSolitaire {
	//https://app.codility.com/demo/results/training94S8FH-3R4/ Score 12%   
	public static int solution(int[] A) {
		int n = A.length;
		int res = A[0] + A[n - 1], max = 0, k = 6;
		Stack<Integer> dice = new Stack<>();

		if (dice.isEmpty())
			dice.push(1);
		for (int i = 0; i < n - 2; i = i + dice.peek()) {
			max = A[i + 1];
			dice.push(i + 1);
			System.out.println(res);
			k = 6;
			while (k > 0) {

				if (i + k < n) {
					for (int j = i + 1; j <= i + k; j++) {
						if (j >= n)
							break;
						// max = A[j];
						if (max < A[j]) {
							dice.pop();
							max = A[j];
							dice.push(j % 6);
						}

					}
				}
				k--;
			}
			res += max;
		}
		dice.pop();
		System.out.println(max);
		if ((!dice.isEmpty()) && (dice.peek() + 6 > n) && (max < 0))
			res -= max;
		System.out.println(dice);
		return res;
	}
	
	
	
	public static int solution1(int[] A) {
		int[] dp = new int[A.length];
        dp[0] = A[0];
        for(int i=1; i<A.length; i++){
        	int max = Integer.MIN_VALUE;
        	for(int die=1; die<=6; die++){
                if( i-die >= 0){
                	 max = Math.max( dp[i-die]+A[i], max );
                }
            }    
            dp[i] = max;
 }
        
        return dp[A.length-1];
    }

	public static void main(String[] args) {
		int[] A = { 1, -2, 0, 9, -1, -2 };
		//int[] A = { 1, -2 };
		//int[] A = { -4, -10,-7 };
		//int[]A={0, -4, -5, -2, -7, -9, -3, -10};			//the solution exceeded the time limit.
		//int[] A = {0 , -2 , -3 , -4 , -5 , -6 , -7 , -8 , -9 , -10 , -11, -12 , -13 , -14 , -15 , -16 , -17 , -18};
		System.out.println(solution1(A));
	}

}
