
public class Stringoutofbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			try {
		String str="Iss Pyaar Ko Kya Naam Doon?";
		str.charAt(30);
				}
			catch(StringIndexOutOfBoundsException e) 
			{
				System.out.println("String is:");
			}
}
}
