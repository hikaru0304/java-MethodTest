package MethodTest;
import java.util.Scanner;
public class BMI {
	public static void main(String args[]) {
		getBMI();
	}
	public static void getBMI() {
		Scanner scan= new Scanner(System.in);
		double weight, height;
		System.out.print("몸무게 입력:");
		weight=scan.nextDouble();
		System.out.print("키 입력(단위는cm로 계산한다):");
		height=scan.nextDouble();
		double bmi=weight/((height*0.01)*(height*0.01));
		System.out.println("당신의 BMI지수:"+bmi);
		if(bmi>20) {
			System.out.println("과체중입니다");
		}else {
			System.out.println("정상입니다.");
		}
	}
}
