
public class Adder {

	 static void add(int a,int b)
	{
	System.out.println(a+b);
	}
	 static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		add(11, 11);	//void method can be called directly
		
		System.out.println(add(11, 11, 11));// int methdo have to print statement
	}

}
