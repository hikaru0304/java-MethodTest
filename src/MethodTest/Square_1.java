package MethodTest;
import java.util.Scanner;
/*������ �۾��ߴ� Square.java(���簢�� ����� �� ������ ����Ͽ� ����ϴ� ���α׷��� ������ �� �ۼ��϶�.
 * ���� ���� ���̴� 100m�̰� ���� ���̴� 50m �̴�.)
 * �� �簢���� ���̸� ���ϴ� �޼��带 �ۼ��Ͽ� �����ϵ��� �����϶�.
 */
public class Square_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSquareArea();
	}//end of main

	public static void getSquareArea() {
		Scanner scan= new Scanner(System.in);
		int width, height;
		System.out.print("���� �Է�:");
		width=scan.nextInt();
		System.out.print("���� �Է�:");
		height=scan.nextInt();
		System.out.println("�簢���� ����:"+(width*height));
	}
}
