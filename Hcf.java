import java.util.Scanner;
class Hcf
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int n1 = sc.nextInt();

		System.out.print("Enter second Number : ");
		int n2 = sc.nextInt();

		int hcf = n1 < n2 ? n1 : n2;

		while(true)
		{
			if(n1 % hcf == 0 && n2 % hcf == 0 )
			{
				System.out.print("HCF of given number : " + hcf);
				break;
			}
			hcf --;
		}

	}
}
