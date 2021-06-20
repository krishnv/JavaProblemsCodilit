package Lesson14_BinarySearch;

public class MinMaxDivision {
	//https://app.codility.com/demo/results/trainingWANHNG-F8U/  Score 100
	 public static int solution(int K, int M, int[] A) {
		   int min = 0;
	        int max = 0;
	        for(int i = 0; i < A.length; i++) {
	            max = max + A[i];
	            min = Math.max(min, A[i]);
	        }
	        int mid = 0;
	        int blockSize = 0;
	        while(min <= max) {
	            mid = (min + max)/2;
	            int blocks = check(mid, K, A);
	            //System.out.println(blocks);
	            if(blocks <= K) {
	                blockSize = mid;
	                max = mid-1;
	            }
	            else
	                min = mid+1;
	        }
	        return blockSize;
	    }
	    public static int check(int mid, int k, int []A) {
	        //System.out.print(mid+": ");
	        int blocks1 = 1;
	        int sum = 0;
	        //System.out.print(blocks1+"-> ");
	        for(int i = 0; i < A.length; i++) {
	            if(sum + A[i] <= mid) {
	                sum = sum + A[i];
	                //System.out.print(sum);
	            }
	            else {
	                //System.out.print(blocks1);
	                
	                blocks1++;
	                sum = A[i];
	                //System.out.print(blocks1+" ->");
	            }
	        }
	        //System.out.println(blocks1);
	        return blocks1;
		 
	 }
	
	
	public static void main(String[] args) {
		int[] A = new int[]{2,1,5,1,2,2,2};
		int M = 5;
		int K = 3;
		System.out.println(solution(K, M, A));

	}

}
