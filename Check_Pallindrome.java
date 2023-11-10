package DSA;
import java.util.Scanner;

public class Check_Pallindrome {
    public static void main(String args[]) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        int n = number;
        int rev = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }

        if(number == rev) {
        	return true;
        }
        else {
        	return false;
        }
    }
}







/*
public class Check_Pallindrome {
	public static void main(String args[]) {
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int rev = 0;
	
	public static void isPalindrome(int number) {
		int n = number;
			
		while(n != 0) {
			int lastDigit = n%10;
			rev = rev *10 + lastDigit;
			n = n/10;
				
		}
		System.out.println(rev);
		
	}
	
		
		if(n == rev) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	
		
	}

}
*/


