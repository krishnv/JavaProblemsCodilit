package Lesson3_TimeComplexity;

//			Score =44%
public class FrogImp {
	static int a =-1;
	public static int solution(int x, int y, int d) {
		
		if(d==0)
			return -1;
		a++;
		a=(x>y)?a:solution(x+d, y, d);
		return a;
		
	}
	//https://app.codility.com/demo/results/trainingYU8SPT-GES/   score=100 
	public int solution1(int X, int Y, int D) {
	        return (int)Math.ceil((double)(Y-X)/D);
	    }
	
	
	
	
	public static void main(String[] args) {
		int x,y,d;
		x= 10;
		y = 85;
		d = 30;
		System.out.println(solution(x, y, d));

	}

}
