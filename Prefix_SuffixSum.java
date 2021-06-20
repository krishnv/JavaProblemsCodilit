package Lesson5_PrefixSums;

import java.util.Arrays;

public class Prefix_SuffixSum {
	
	public static int[]  prefixSum(int[] A){
		int n=A.length;
		int[]P=new int[n+1];
		
		for (int i =1; i < P.length; i++) {
			P[i]=P[i-1]+A[i-1];
		}
		return P;
		
	}
	public static int[]  suffixSum(int[] A){
		int n=A.length;
		int[]P=new int[n+1];
		
		for (int i =A.length; i >1; i--) {
			P[i-1]=P[i]+A[i-1];
		}
		System.out.println(Arrays.toString(P));
		return P;
		
	}
	
	
	public static void sumOfSlicesPrefix(int[] P,int x, int y){
		System.out.println(P[y+1]-P[x]);
	}
	public static void sumOfSlicesSufffix(int[] P,int x, int y){
		System.out.println(P[y+1]-P[x]);
	}
	public static void main(String[] args) {
		int[] A={1,3,6,3,7,9};
		int[] P=prefixSum(A);
		sumOfSlicesPrefix(P, 3, 5);
		int []P2=suffixSum(A);
		sumOfSlicesSufffix(P2, 2, 4);

	}

}
