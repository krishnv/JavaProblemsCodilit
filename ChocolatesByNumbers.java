package Lesson12_Euclidean;

import java.util.Arrays;

public class ChocolatesByNumbers {
	//https://app.codility.com/demo/results/training7QMZBT-NQW/		Score=50
	private static int solution(int N, int M) {
		int[] A=new int[N];
		int i=0;
		int count=0;
		if (N==M)
			return 1;
		else{
			while(A[((i+M)%N)]==0){
				//A[0]=1;
				A[((i+M)%N)]=1;
				i=i+M;
				count++;
			}
		}
		//System.out.println(Arrays.toString(A));
		return count;
	}
	
	
	//https://app.codility.com/demo/results/trainingW7DHSR-D2P/		Score 100
	private static int solution2(int N, int M) {
		return N/gcd(N, M);
		

	}
	public static int gcd(int a, int b){
		if(a%b==0){
			return b;
		}
		return gcd(b,a%b);
	}
		
		
		
	
	public static void main(String[] args) {
		int N =10;
		int M =4;
		
		System.out.println(solution2(N,M));
	}

}
