package DSA.Arrays;

public class Binary_Search_Code {

	public static int binary_search(int numbers[], int key) {
		int start = 0;
		int end = numbers.length - 1;
		
		
		    
		while(start <= end) {
			int mid = (start + end) / 2;
			
			if(numbers[mid]==key) {   //comparision 
				return mid;
			}
			if(numbers[mid]<key) {    //go towards right
				start = mid + 1;
			}
			else {                     //go towards left
				end = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int numbers[] = {2,4,6,8,10,12,14};
		int key = 25;
		
		System.out.println("index of key is : " +binary_search(numbers, key));
		
	}
}
