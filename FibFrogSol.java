package Lesson13_Fibbonacci;

import java.util.ArrayList;
import java.util.List;

public class FibFrogSol {
	//https://app.codility.com/demo/results/training8RSB23-FDX/	Score100
	class Solution {
		   class Jump
		{
			int position;
			int counter;
			
			public Jump(int position , int counter) {
				this.position = position;
				this.counter = counter;
			}
		}

			
			public int solution(int[] A)
			{
				if(A.length < 1) return 1;
				List<Integer> list = new ArrayList<>();
				int a = 0 , b = 1 , count = 0;
				
				while(a + b <= A.length + 1)
				{
					list.add(a + b);
					int temp = b;
					b = a + b;
					a = temp;
					
				}
				boolean[] visited = new boolean[A.length];
				Jump jump = new Jump(-1 , 0);
				List<Jump> jumps = new ArrayList<>();
				jumps.add(jump);
				while(true)
				{
					if(count == jumps.size()) return -1;
					jump = jumps.get(count);
					count++;
					for(int i = list.size() - 1 ; i >= 0 ; i--)
					{
						if(jump.position + list.get(i) == A.length) return (jump.counter + 1);
						else if(jump.position + list.get(i) > A.length || A[jump.position + list.get(i)] == 0 ||
								visited[jump.position + list.get(i)] == true) continue;
						Jump jump1 = new Jump(jump.position + list.get(i) , jump.counter + 1);
						jumps.add(jump1);
						visited[jump.position + list.get(i)] = true;
					}
				}
			
		}}
	public static void main(String[] args) {
		int[]A={0,0,0,1,1,0,1,0,0,0,0};
		System.out.println();

	}

}
