package abstraction;

public class rest extends Restaurant{
	
	void show()
	{
		System.out.println("Open");
	}
	void display()
	{
		System.out.println("Closed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Restaurant r=new rest ();
			r.show();
			r.display();
			
	}


}
