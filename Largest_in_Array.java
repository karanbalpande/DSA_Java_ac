package DSA.Arrays;
import java.util.*;

public class Largest_in_Array {
	public static int getLargest(int numbers[]) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
	
		for(int i=0; i<numbers.length; i++) {
			
			if(largest < numbers[i]) {
				largest = numbers[i];
			}
			if(smallest > numbers[i]) {
				smallest = numbers[i];
			}
		}
		System.out.println("Smallest number : " + smallest);
		return largest;
			
	}
	
	
	public static void main(String args[]) {
		int numbers[] = {1,2,4,5,7,8,9,11,15};
		System.out.println("Largest value is : " + getLargest(numbers));
	}
}
