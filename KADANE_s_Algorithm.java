package DSA.Arrays;
import java.util.*;

public class KADANE_s_Algorithm {
	public static int kadanes(int numbers[]) {
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		
		for(int i=0; i<numbers.length; i++) {
			currSum = currSum + numbers[i];
		
			if(currSum < 0) {
				currSum = 0;
			}
			maxSum = Math.max(currSum, maxSum);
		}
		return maxSum;
	}

	
	public static void main(String args[]) {
		
		int arr[] = {-1,-2,-3,-4};
		kadanes(arr);
	}
}
