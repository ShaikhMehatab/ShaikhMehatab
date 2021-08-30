import java.util.Scanner;
public class JavaTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int i=1,j;	//initializing input

Scanner sc=new Scanner(System.in);
System.out.println("Enter A Number:");	//geting input

int n=sc.nextInt();
while(i<=10)				//finding mul of n with i
{
	
	System.out.println(n + "*" +i+ "=" + n * i);	//printing mul table of n
	++i;
}
	}

}
