
import java.util.Scanner;
public class Averageno {
	public static void main(String[ ] arg) {
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 System.out.println("enter ele");
		 for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		 }
		 for(int i=0;i<n;i++) {
			result=result+arr[i]; 
		 }
		 System.out.println("averge is"+result/n);
	}

}
