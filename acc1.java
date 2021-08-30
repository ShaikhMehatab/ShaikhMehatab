import java.util.Scanneer;
import java.util.Scanner;
public class acc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int userch;
		boolean quit=false;
		do
		{
			System.out.println("Your choice, 0 To quit : ");
			userch=s.nextInt();
			
				if(userch==0)
					quit=true;
		}while(!quit);

	
	System.out.println("Thank You For your Transaction!");
	}
}
