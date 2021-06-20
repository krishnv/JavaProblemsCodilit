package Lesson16_Greedy;

import java.util.ArrayList;
import java.util.List;

class Coin{
	int denomination;
	int count;
	
	public Coin(int denomination, int count) {
		this.denomination=denomination;
		this.count=count;
	}

	@Override
	public String toString() {
		return "Coin [denomination=" + denomination + ", count=" + count + "]";
	}
	
}
public class CoinCount {
public static List<Coin> greedyCoinChange(int[]M,int k){
	int n=M.length;
	List<Coin> res=new ArrayList<>();
	
	for (int i = n-1; i >-1; i--) {
		res.add(new Coin(M[i],k/M[i]));
		k%=M[i];
	}
	return res;
	
}
public static void main(String[] args) {
	//int[]M={1,2,5};
	//System.out.println(greedyCoinChanging(M, 2));
	
	int[]M={1,3,4};
	System.out.println(greedyCoinChange(M, 2));
	System.out.println(greedyCoinChange(M, 3));
	System.out.println(greedyCoinChange(M, 5));
	System.out.println(greedyCoinChange(M, 6));
	
	//System.out.println(dpCoinChanging(M, 6));
}

}