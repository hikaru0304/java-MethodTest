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
		System.out.print("Ã¹ ¹øÂ° ¼ö ÀÔ·Â:");
		num1=scan.nextInt();
		System.out.print("µÎ¹øÂ° ¼ö ÀÔ·Â:");
		num2=scan.nextInt();
		double answer;
		answer=num1+num2;
		System.out.println("µ¡¼À °á°ú:"+answer);
		answer=num1-num2;
		System.out.println("»¬¼À °á°ú:"+answer);
		answer=num1*num2;
		System.out.println("°ö¼À °á°ú:"+answer);
		answer=num1/num2;
		System.out.println("³ª´°¼À °á°ú:"+answer);
		}

}
