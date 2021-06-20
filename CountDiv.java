package Lesson5_PrefixSums;

public class CountDiv {
	//https://app.codility.com/demo/results/trainingW5CNYV-ZMS/			Score-100
	public static int solution(int A, int B, int K)
	{
		int a=(int)Math.floor(A/K);
		int b=(int)Math.floor(B/K);
		
		if(A % K == 0)
		return b-a+1;
		else return b-a;
		
		
	}
	
	public static void main(String[] args) {
		int A=0,B=13,K=2;
		System.out.println(solution(A, B, K));

	}

}
