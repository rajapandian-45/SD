package DSA;

public class task3 {
	
	public static int fac(int n) {
		if (n==0) {
			return 1;
		}
		else {
			return n* fac(n-1);
		}
		
	}
	public static void main(String[]args) {
		int number = 10;
		System.out.println("factorial of " +   number  + " is : " + fac(number));
	}
	
	

}
