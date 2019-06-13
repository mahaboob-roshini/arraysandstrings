

import java.util.Scanner;

public class Palindrome {
	public static void main(String[ ] arg) {
		int temp,r=0,n,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		n=sc.nextInt();
		temp=n;
		while(n!=0) {
			a=n%10;
			r=(r*10)+a;
			n=n/10;
		}
		if(temp==r) {
			System.out.println("palindrome no"+r);
		}
		else
			System.out.println("not");	
	}
	

}
