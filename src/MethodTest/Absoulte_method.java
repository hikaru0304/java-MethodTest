package MethodTest;
import java.util.Scanner;
public class Absoulte_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num1;
		System.out.print("���� �Է�:");
		num1=scan.nextInt();
		if(num1>=0) {
			System.out.print("������:"+num1);
		}else if(num1<0) {
			System.out.print("������:"+-num1);
		}
	}//end of main
	
	public static int absoulte(int n) {
		if(n>=0) {
			return(n);
		}else {
			return(n*-1);
		}
	}

}
