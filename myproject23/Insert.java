
import java.util.Scanner;
public class Insert {
	public static void main(String args[]) {
		int l,p,ele;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of length in the array:");
	l = s.nextInt();
	  int array[] = new int[l+1];
	  System.out.println("Enter "+l+" elements ");
      for(int i=0; i < l; i++)
      {
          array[i] = s.nextInt();
      }
      System.out.print("Enter number of elemnt in the array:");
      ele=s.nextInt();
      array[l]=ele;
      for(  int i=0; i < l; i++)
      {
    	  System.out.println  (array[i]); 
      }
      System.out.println("after"+array[l]) ; 
}
}