package Lesson7_StackAndQueue;

import java.util.Stack;import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class Fish {
	//https://app.codility.com/demo/results/trainingZHTZWK-QWZ/			Score 37
	public static int solution(int[] A, int[] B){
		 Stack<Integer> st=new Stack<>();
		 int fish=A.length;
		 int index=0;
		 for (int i = 0; i < B.length; i++) {
			 if(B[i]==0 &&st.size()==0)
				 st.push(B[i]);;
			if(B[i]==1 &&st.size()==0)
				{st.push(B[i]);
				index=i;
				}
			if(B[i]==0 &&st.size()==0)
					st.push(B[i]); 
			if(B[i]==1 &&st.peek()==0)
			{ st.push(B[i]); 
			index=i;
			}
			if(B[i]==1 &&st.peek()==1)
			 st.push(B[i]);
			if(B[i]==0 &&st.peek()==1)
			{	fish--;
				int temp=st.pop();
				if(A[index]>A[i])
					st.push(1);
				else st.push(B[i]);
			
			}
			
		}
		 return fish;
    }
		 
		 
	 
	 
	 //https://app.codility.com/demo/results/trainingEFWQ5E-SQC/		Score100
	 public static int solution2(int[] A, int[] B) {
			Stack<Integer> stack = new Stack<Integer>();
			int fish = A.length;
			for (int i = 0; i < A.length; i++) {
				if(B[i]==1)
					stack.push(A[i]);
				
				else
				{
					while(!stack.isEmpty())
					{
						if(stack.peek()>A[i])
						{		
							fish--;
							break;
						}
						
						if(stack.peek()<A[i])
						{
							fish--;
							stack.pop();
						}
					}
				}		
			}
			return fish;
		}
	 
	public static void main(String[] args) {
//		int[] A={4,3,2,1,5};
//		int[] B={0,1,0,0,0};
		int[] A={1,2,3,4,5};
		int[] B={1,1,1,0,1};
		System.out.println(solution2(A, B));

	}

}
