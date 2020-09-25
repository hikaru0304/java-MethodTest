package MethodTest;
import java.util.Scanner;
public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int temp;
		System.out.println(a); System.out.println(b);
		temp=a;
		a=b;
		b=temp;
		System.out.println(a); System.out.println(b);	
	}

}
