package Lesson12_Euclidean;

public class EuclideanAlgo {
	public static int gcd(int a, int b){
		if(a==b){
			return a;
		}
		if(a>b){
			return gcd(a-b,a);
		}
		else{
			return gcd(a,b-a);
		}
	}
	
	public static int lcm(int a, int b){	//Stein's algo
		
		return a*b/gcd(a,b);
		
	}
	public static void main(String[] args) {
		System.out.println(gcd(17,3));

	}

}
