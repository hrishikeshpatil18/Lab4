package Lab4;			//sun of cubes of digits of a number

public class Excercise1 {
	static int calculate(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+digit*digit*digit;
			num=num/10;
		}
		return sum;
	}
	public static void main(String args[])
	{
		int result=calculate(1232);
		System.out.println(result);
	}

}
