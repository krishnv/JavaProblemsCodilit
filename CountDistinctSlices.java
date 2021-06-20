package Lesson15_CatterPilarMethod;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctSlices {
	// https://app.codility.com/demo/results/trainingH8GXMQ-5G7/ Score 100
	public static int solution(int M, int[] A) {
		Set<Integer> set = new HashSet<>();
		int n = A.length;
		int slices = 0;
		int front = 0;
		for (int back = 0; back < n; back++) {
			front = back;
			while (front < n) {
				if (set.contains(A[front]) == false) {
					slices++;

					if (slices == 1000000000)
						return 1000000000;

					set.add(A[front]);
				} else {
					break;
				}
				front++;
			}
			set.clear();
		}
		return slices;
	}
	
	//https://app.codility.com/demo/results/trainingZHG4J9-YH8/		Score 90
	public static int solution2(int M, int[] A) {
		Set<Integer> set = new HashSet<>();
		int count=0,tail=0;
		
		for (int i = 0; i < A.length; i++) {
			if(!set.contains(A[i])){
				set.add(A[i]);
				continue;
			}
			count+=slice(i-tail);
			while(A[tail]!=A[i]){
				set.remove(A[tail]);
				tail++;
			}
			tail++;
			count-=slice(i-tail);
		}
		count+=slice(A.length-tail);
		return Math.min(count, 1000000000);
			
		}
	
	public static int slice(int n){
		return n*(n+1)/2;
	}

	public static void main(String[] args) {
		int[] A = { 3, 4, 5, 5, 2 };
		int M = 6;
		System.out.println(solution2(M, A));
	}

}
