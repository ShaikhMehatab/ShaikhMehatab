package acesssp;


public class child extends AccessDemo {
	void show()
	{
		AccessDemo c= new AccessDemo();
		System.out.println(c.i);
		System.out.println(c.j);
		System.out.println(c.k);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c1=new child();
		c1.show();
				

	}
}

