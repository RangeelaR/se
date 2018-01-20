import java.util.Scanner;

public class num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		int m = sc.nextInt();
		for(int i=1;i<6;i++)
		{
			int n=m*i;
			System.out.println(n);
		}
	}
	}
