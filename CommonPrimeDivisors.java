package Lesson12_Euclidean;

import java.util.Stack;

public class CommonPrimeDivisors {
	public static int solution(int[] A, int[] B) {
		Stack<Integer> st = new Stack<>();
		int x, y, gcd, count = 0, temp = 0;
		for (int i = 0; i < B.length; i++) {
			x = A[i];
			y = B[i];
			gcd = gcd(x, y);
			if (x % 2 == 0) {
				st.push(2);
				x /= 2;
			}
			for (int j = 3; j <= Math.sqrt(x); j += 2) {
				if (x % j == 0) {
					st.push(j);
					x /= j;
				}
			}
			if (x > 2)
				st.push(x);

			if (y % 2 == 0) {
				st.push(st.pop() ^ 2);
				y /= 2;
			}
			for (int j = 3; j <= Math.sqrt(y); j += 2) {
				if (y % j == 0) {
					st.push(st.pop() ^ j);
					y /= j;
				}
			}
			if (y > 2)
				st.push(st.pop() ^ y);

			while (st.size() != 1) {
				temp = st.pop();
				st.push(st.pop() ^ temp);
			}
			if (st.peek() == gcd)
				st.pop();

			if (st.isEmpty())
				count++;
			System.out.println(st);
			st.clear();

		}
		// System.out.println(st);
		return count;

	}

	public static int gcd(int a, int b) {   
        if (a == 0)   
            return b;   
        return gcd(b % a, a);   
    }
    
    public static boolean primeDiv(int a, int b) {
        int gcdAB = gcd(a, b);
        int gcA, gcB;
        
        while (a != 1) {
            gcA = gcd(a, gcdAB);
            if (gcA == 1)
                break;
            a = a/gcA;
        }
        if (a != 1)
            return false;
            
        while (b != 1) {
            gcB = gcd(b, gcdAB);
            if (gcB == 1)
                break;
            b = b/gcB;
        } 
        if (b == 1)
            return true;
        else
            return false;
    }
   
    // https://app.codility.com/demo/results/trainingDH6N2W-YBD/	score100
    public static int solution2(int[] A, int[] B) {
        int count = 0;
        for(int i=0;i<A.length; i++) {
            if(primeDiv(A[i], B[i])){
                count++;    
            } 
        }
        return count;
    }


	
	public static void main(String[] args) {
		int[] A = new int[] { 15, 10, 3 };
		int[] B = new int[] { 75, 30, 5 };
		System.out.println(solution2(A, B));

	}

}
