
public class Circle implements Shape {
	
	int r;
	double pi=3.14;  //initializing+declaring 
	public void in()
	{
		r=5;		//declaring radius of circle
	}
	public void area()
	{
		System.out.println("Area of Circle is="+(pi*r*r));
		//calculating+printing Area Of Circle
	}

}
