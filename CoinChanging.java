package Lesson17_DynamicProgramming;

public class CoinChanging {
	public static int coin(int[] C,int k){
		  int n = C.length;
	        int[][] dp = new int[n+1][k + 1];
	        for (int i = 1; i < k + 1; i++) {
	            dp[0][i] = Integer.MAX_VALUE;
	        }
	        /*for (int i = 0; i < n+1; i++) {
	            for (int j = 0; j < k+1; j++) {
	                if (i == 0)
	                    System.out.print(dp[i][j]+"    ");
	                else
	                    System.out.print(dp[i][j]+"            ");
	            }
	            System.out.println();
	        }*/
	        
	        for(int i=1;i<n+1;i++){
	            for(int j=0;j<C[i-1];j++){      // j=0 ..... C[0]=0
	                dp[i][j]=dp[i-1][j];
	            }
	            for(int j=C[i-1];j<k+1;j++){
	                dp[i][j]=Math.min(dp[i][j-C[i-1]]+1,dp[i-1][j]);
	            }
	        }
	        
	        for (int i = 0; i < n+1; i++) {
	            for (int j = 0; j < k+1; j++) {
	                if (i == 0)
	                    System.out.print(dp[i][j]+"    ");
	                else
	                    System.out.print(dp[i][j]+"            ");
	            }
	            System.out.println();
	        }
	        return dp[n][k];
	    }
	
	public static void main(String[] args) {
		int[] C={1,5,6,9};
		int k=10;
		coin(C, k);
	}

}
