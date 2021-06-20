package Lesson11_SieveOfEratosthenes;

import java.util.Arrays;
import java.util.HashMap;

public class CountNotDivisible1 {
	//https://app.codility.com/demo/results/trainingN3EWAZ-MKH/		Score 100
	public static int[] solution(int[] A){
			int n=A.length,c=0,c1=0;
			int m=Arrays.stream(A).max().getAsInt();
			int [] count=new int[m+1];
			int [] nondiv=new int[n];
			for(int j=0;j<n;j++){
				count[A[j]]++;
			}
			for(int j=0;j<n;j++){ int k=1;
				while(k<=Math.sqrt(A[j])){
					if(A[j]%k==0){c+=count[k];
					if(A[j]/k!=k){
								c+=count[A[j]/k];}}
					k++;}
				nondiv[j]=(n-c);
				c=0;
				}
			return nondiv;
		
	}
	
	
	public static void main(String[] args) {
		int[] A={3,1,2,3,6};
		System.out.println(Arrays.toString(solution(A)));

	}

}
