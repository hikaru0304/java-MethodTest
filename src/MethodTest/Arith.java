package MethodTest;
import java.util.Scanner;
public class Arith {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arith();
	}//end of main
	public static void arith() {
		Scanner scan= new Scanner(System.in);
		double num1;
		double num2;
		System.out.print("ù ��° �� �Է�:");
		num1=scan.nextInt();
		System.out.print("�ι�° �� �Է�:");
		num2=scan.nextInt();
		double answer;
		answer=num1+num2;
		System.out.println("���� ���:"+answer);
		answer=num1-num2;
		System.out.println("���� ���:"+answer);
		answer=num1*num2;
		System.out.println("���� ���:"+answer);
		answer=num1/num2;
		System.out.println("������ ���:"+answer);
		}

}
