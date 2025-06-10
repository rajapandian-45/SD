package DSA;

import java.util.Scanner;

public class post_assignment1 {
	
	public static void main(String[]args)

	{
		Scanner rp=new Scanner(System.in);
		int n=rp.nextInt();
		int sd;
		int sum=0;
		while(n>0)
		{
			sd=n%10;
			n=n/10;
			sum = sum+sd;	
		}
		System.out.println("sum of digit:" +sum);
	}
}
