package DSA.Arrays;
import java.util.*;

public class Linear_Search {
	public static int linear_search(int numbers[], int key) {
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int numbers[] = {2,4,5,6,1,7,8,9,10};
		int key = 10;
		
		int index = linear_search(numbers, key);
		
		if(index == -1) {
			System.out.println("NOt found");
		
		}
		else {
			System.out.println("Key index is at : " + index);
		}
	}
}
