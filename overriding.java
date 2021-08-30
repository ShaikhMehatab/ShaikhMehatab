
public class overriding {
	
	void run()
	{
		System.out.println("Vehicle is Running");
	}
}
 class bike extends overriding{
	
	void run()
	{
		System.out.println("Bike is Running Safely");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bike b=new bike();
		b.run();

	}

}

