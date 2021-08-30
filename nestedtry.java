
public class nestedtry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("division");
			int a=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		try {
			int a[]=new int[5];
			a[5]=3;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("other");
	}

	
}
