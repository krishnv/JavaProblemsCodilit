package Lesson16_Greedy;

public class TieRope {
	//https://app.codility.com/demo/results/trainingBBSCXE-B5E/ Score 100
	public int solution(int K, int[] A){
		int n=A.length;
		int count=0,sum=0;
		for (int i = 0; i < A.length; i++) {
			if(A[i]>=K){
				count++;
				sum=0;}
			
			else if(sum<=K)
				sum=sum+A[i];
			if(sum>=K){
				count ++;
				sum=0;	
			}
		}
		return count;
	}
	public static void main(String[] args) {
		/*int[] A={1,2,3,4,1,1,3};
		int K=4;*/
		int[]A={2,1};
		int K=2;
		System.out.println(new TieRope().solution(K, A));
	}

}
