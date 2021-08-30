package area;

public class calArea extends shape {
	
		void rectArea(int l, int b)
		{
			System.out.println("Area of Rectangle is = " +(l*b));
		}
		
		void sqArea(int a)
		{
			System.out.println("Area of Square is = " +(a*a));
		}
		
		void circleArea(int r)
		{
			System.out.println("Area of Circle is = " +(3.14*r*r));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			calArea cal=new calArea();
			cal.rectArea(5, 4);
			cal.sqArea(4);
			cal.circleArea(8);

	}

}
