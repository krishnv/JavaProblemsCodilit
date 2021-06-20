package Lesson2_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class CyclicRotation {
	//https://app.codility.com/demo/results/trainingH3WQ3K-DYF/		Score-100
	public static int[] solution(int[] A, int K) {
		int i,a,b;
		b=A.length;
		if(b<1)
			return A;
		if(K==0){
			return A;
		}
		
		int[] B= new int[b];
		for(i=0;i<K;i++){
			
			B[0]=A[b-1];
			for(int j=1;j<b;j++){
			B[j]=A[j-1];
			}
			A=Arrays.copyOf(B, b);	
		}
		
		return B;	
	}
	//Score - 100 - Sir's Logic
	public static int[] solution2(int[] A, int K) {
		int i,a,b;
		b=A.length;
		if(b<1)
			return A;
		
		int[] B= new int[b];
		for(i=0;i<b;i++){
			int newindex=(i+K)%A.length;
			B[newindex]=A[i];
		}
		return B;
}

	public static void main(String[] args) {
		int[] A = {10,20,30,50};
			int    K = 0;
			
		
			System.out.println(Arrays.toString(solution(A, K)));
			
			
}}
