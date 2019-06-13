
import java.util.Scanner;
class Constants {
public static void main(String[ ] arg)
	{
	String s;
	char ch;
	int i=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string : ");
	s=sc.nextLine();	
	System.out.println("constants in a string are"); 
	for(int j=0;j<s.length();j++)
	{
	ch=s.charAt(j);	
	switch(ch)
	{
	 case  's' :
	 case 'd'  :
	 case 'l'  :
	 case 'g' :
	 case 't'  :
	 case  'S' :
	 case 'D'  :
	 case 'L'   :
	 case 'G'  :	
	 case 'T'  :i=1;
		System.out.println(ch); 			 
	}	
if(i==0) {
	System.out.println("not con" );
}
	}

}
}