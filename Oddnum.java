
public class Oddnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;		//initializin input
		System.out.println("Odd Numbers Between 0 T0 99  are=");
		
		while(i<100)	//initializing condition 
		{
			if(i % 2 != 0)	//condition for odd num
			{
				System.out.println(i + " ");
				
			}
			++i;
			/*
			 1st Iteration: (while)condion true->(if)condition false
			 It'll increase i by 1 and now i=1
			 2nd Iteration: (while)condion true->(if)condition true
			 It'll print 1 and go out from if loop and i increase by 1 now i=2 and so on
			 */
		}
	}

}
