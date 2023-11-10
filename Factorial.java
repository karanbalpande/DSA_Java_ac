package DSA;

public class Factorial {
	public static int factorial(int n) {
		int f = 1;
		
		for(int i=1; i<=n; i++) {
			f = f * i;
		}
		return f;
	}
	
	public static int bincoeff(int n, int r) {
		int fact_n = factorial(n);
		int fact_r = factorial(r);
		int fact_nmr = factorial(n-r);
		
		int bincoeff = fact_n / (fact_r * (fact_nmr));
		return bincoeff;
	}
	
	public static void main(String args[]) {
		System.out.println(factorial(4));
		//System.out.println(bincoeff(5, 2));    //for binomial coefficient function bincoeff
	}

}
