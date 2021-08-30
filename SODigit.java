import java.util.Scanner;
public class SODigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number:");
		num=sc.nextInt();
		
			while(num>0)
			{
				digit=num%10;	//finds the last digit of given num
				sum=sum+digit;	//add last digit to variable sum
				num=num/10;		//removes the last digit from the num
				/*
				 1st iteration: cond true->
				 d=1432%10=2
				 s=0+2=2
				 num=1432/10=143
				 ..
				 5th iteration: cond false->
				 It'll Print previous sum as 10
				 */
			}
			System.out.println("Sum Of Digits is="+sum);
	}

}
