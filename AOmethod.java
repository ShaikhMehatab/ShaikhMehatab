
public class AOmethod {
	
	static int a,b,c;
	static double d,e,f;
	
	static int x,y,z;
	static double p,q,r;
	
	static int i,j,k;
	static double l,m,n;
	
	//this code is for substraction
	public static void sub(int a,int b)
	{
		c=a-b;
		System.out.println("Sub is="+c);
	}
	
	public static void sub(double d,double e)
	{
		f=d-e;
		System.out.println("Sub is="+f);
	}
	
	//this code is for multiplication
	public static void mul(int x,int y)
	{
		z=x*y;
		System.out.println("Mul is="+z);
	}
	
	public static void mul(double p,double q)
	{
		r=p*q;
		System.out.println("Mul is="+r);
	}
	
	//this code is for division
		public static void div(int i,int j)
		{
			k=i/j;
			System.out.println("Div is="+k);
		}
		
		public static void div(double l,double m)
		{
			n=l/m;
			System.out.println("Div is="+n);
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sub(20,10);
		sub(22.5,10.5);
		mul(10,20);
		mul(10.5,20.5);
		div(20,10);
		div(30.8,5.5);
	
	}

}
