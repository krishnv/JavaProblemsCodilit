package Lesson15_CatterPilarMethod;

import java.util.Arrays;

public class Exercise {
	//Slice whose sum is s
	public static boolean catterpillarMethod(int[]A,int s){
		int n=A.length;
		int front=0,total=0;
		for (int back = 0; back <n; back++) {
			while(front<n &&total+A[front]<=s){
				total+=A[front];
				front+=1;
			}
			if(total==s){
				return true;
			}
			total-=A[back];
		}
		return false;
	}
	
	public static int triangles(int []A){
		int n=A.length;
		int res=0;
		for (int x = 0; x <n; x++) {
			int z=x+2;
			for (int y = x+1; y <n; y++) {
				while(z<n && A[x]+A[y]>A[z]){
					z+=1;
				}
				res+=z-y-1;
			}
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		int[] A={6,2,7,4,1,3,6};
		Arrays.sort(A);
		System.out.println(catterpillarMethod(A, 13));
		System.out.println(triangles(A));
	}

}
