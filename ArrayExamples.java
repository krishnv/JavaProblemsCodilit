package Lesson2_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayExamples {

	public static int negative(int[] temperatures){
		int N=temperatures.length;
		int days=0;
		for(int i=0;i<N;i++){
			if(temperatures[i]<0){
				days++;
			}
		}
		return days;
		
	}
	
	public static int[] reverse(int[]A){
		int n=A.length;
		int temp=0;
		int k=0;
		for(int i=0;i<n/2;i++){
			k=n-1-i;
			temp=A[i];
			A[i]=A[k];
			A[k]=temp;
		}
		return A;
	}

	
	public static void main(String[] args) {
		/*int[]temperatures={10,20,30,-90,-19,-20};
		System.out.println(negative(temperatures));
	*/
		int[] A={10,20,30,40,50};
	//	System.out.println(Arrays.toString(reverse(A)));
		Collections.reverse(Arrays.asList(A));
		System.out.println(Arrays.toString(reverse(A)));
}
	}


