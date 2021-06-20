package Lesson14_BinarySearch;

import java.util.Arrays;

class Plank{
	int start;
	int end;
	
	Plank(int start, int end){
		this.start=start;
		this.end=end;
	}
	@Override
	public String toString() {
		return "Plank [start=" + start + ", end=" + end + "]";
	}
}
class Nail{
	int index;
	int pos;
	
	Nail(int index,int pos){
		this.index=index;
		this.pos=pos;
	}
	@Override
	public String toString() {
		return "Nail [index=" + index + ", position=" + pos + "]";
	}
}

public class NailingPlanks {
	public static int solution(int[] A, int[] B, int[] C) {
        int len = 1;
       while(len <= C.length) {
           int arr[] = new int[len];
           for(int i = 0; i < len; i++) {
               arr[i] = C[i];
           }
           Arrays.sort(arr);
           int k = 0;
           int i = 0;
           for(i = 0; i < A.length; i++) {
               while(k<len){
                   if(A[i] <= arr[k] && B[i] >= arr[k]) {
                       //k++;
                       break;
                   }
                   else
                       k++;
               }
               if(k >= len)
                   break;
           }
           if(i >= A.length)
               return len;
           else 
               len++;
       }
       return -1;
   }
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	int[]A={1,4,5,8};
	int[]B={4,5,9,10};
	int[]C={4,6,7,10,12};
	System.out.println(solution(A, B, C));
	}

}
