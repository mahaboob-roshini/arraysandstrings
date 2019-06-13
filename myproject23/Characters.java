
import java.util.Scanner;
class   Characters
{
	public static void main(String[ ] arg)
	{
	int i=0,count=0;
	String n;
	char ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n string");
	n= sc.nextLine();	 
	for(int j=0;j<n.length();j++) {
	ch=n.charAt(j);

if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
	count++;
}
else if(ch=='s') {
	System.out.println("no");
}
else {
	System.out.println("");
}
}
System.out.println(""+count);
	}
}
