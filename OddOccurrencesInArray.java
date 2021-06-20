package Lesson2_Arrays;

import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

public class OddOccurrencesInArray {
	
	public static int solution(int[] A){
		
		
		if(A.length>1)
		{	int res=0;
			for(int i:A){
				res^=i;
			}
			return res;
		}
	return A[0];	
		
	}
	
public static int solution1(int[] A){
		
		Arrays.sort(A);
		int temp=1;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==A[i+1]){
				temp++;
			}
			else{
				temp=1;
			} 
			if(temp%2!=0){return A[i];}
		}
	return A[0];	
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={9,6,5,6,9};
		System.out.println(OddOccurrencesInArray.solution1(A));
	}

}
