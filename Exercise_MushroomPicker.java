package Lesson5_PrefixSums;

import java.util.Arrays;

public class Exercise_MushroomPicker {

	public static int[]  prefixSum(int[] A){
		int n=A.length;
		int[]P=new int[n+1];
		
		for (int i =1; i < P.length; i++) {
			P[i]=P[i-1]+A[i-1];
		}
		return P;
		
	}
	public static int sumOfSlicesPrefix(int[] P,int x, int y){
		return P[y+1]-P[x];
	}
	
	
	public static int maxMushroom(int[] P, int k, int m){
		int a=sumOfSlicesPrefix(P, 0, k);
		int max=a;
		
		for (int i = 0; i < P.length; i++) {
			if(a==P[i])
			{
				for (int j = i, l=0; j < P.length; j++,l++) {
					if(P[j]-P[l]>max)
						max=P[j]-P[l];
			
		}
				return max;
			}}
	return max;	
	}
	
	public static void main(String[] args) {
		int[] A={2,3,7,5,1,3,9};
		int k=4, m=6;
	//	int[] A={10,30,40,50,20,15,25};
		int[] P=prefixSum(A);
		int max=maxMushroom(P, k, m);
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(P));
		System.out.println(max);
	}

}
