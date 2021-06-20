package Lesson8_Leader;

import java.util.Stack;

import javax.sound.sampled.SourceDataLine;

public class EquiLeader {
	//https://app.codility.com/demo/results/training58Y79C-QXB/		Score=100
	public static int solution(int[] A) {
	       Stack<Integer> st=new Stack();
	       int size1=0, size2=0;
			int candidate = 0;
			int num = 0;
			int c = 0,j=0;

			for (int i = 0; i < A.length; i++) {
				if (st.isEmpty())
					st.push(A[i]);
				else if (A[i] == st.peek())
					st.push(A[i]);
				else
					st.pop();
			}

			if (st.isEmpty())	return 0;
			else
				{
				candidate=st.peek();
			for (int i = 0; i < A.length; i++) {
				if (A[i] == st.peek()) {
					num++;
				}}
			if (num < A.length / 2)
			return 0;
			
			for(int i=0;i<A.length;i++){
				if(st.peek()==A[i]){c++;}
				if(c>((i+1)/2) && (num-c)>(((A.length-1)-i)/2)){
				j++;}
			}
			
		}
	     return (int) j;  
	    }
	
	
	
	public static void main(String[] args) {
		int []A={4,3,4,4,4,2};
		System.out.println(solution(A));
	}

}
