package MethodTest;
import java.util.Scanner;
public class BMI {
	public static void main(String args[]) {
		getBMI();
	}
	public static void getBMI() {
		Scanner scan= new Scanner(System.in);
		double weight, height;
		System.out.print("������ �Է�:");
		weight=scan.nextDouble();
		System.out.print("Ű �Է�(������cm�� ����Ѵ�):");
		height=scan.nextDouble();
		double bmi=weight/((height*0.01)*(height*0.01));
		System.out.println("����� BMI����:"+bmi);
		if(bmi>20) {
			System.out.println("��ü���Դϴ�");
		}else {
			System.out.println("�����Դϴ�.");
		}
	}
}
