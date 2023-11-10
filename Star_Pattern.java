package DSA;

public class Star_Pattern {
	public static void main(String argsp[]) {
		int n = 4;
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
