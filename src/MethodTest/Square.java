package MethodTest;
import java.util.Scanner;
/*������ �۾��ߴ� Square.java(���簢�� ����� �� ������ ����Ͽ� ����ϴ� ���α׷��� ������ �� �ۼ��϶�.
 * ���� ���� ���̴� 100m�̰� ���� ���̴� 50m �̴�.)
 * �� �簢���� ���̸� ���ϴ� �޼��带 �ۼ��Ͽ� �����ϵ��� �����϶�.
 */
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//width,height�� ���α׷� ����ñ��� �޸𸮿� �����ִ�.
		Scanner scan= new Scanner(System.in);
		int width, height;
		System.out.print("���� �Է�:");
		width=scan.nextInt();
		System.out.print("���� �Է�:");
		height=scan.nextInt();
		getSquareArea(width,height);
	}//end of main
	//�޼��尡 ����� �޸𸮿��� �������.
	public static void getSquareArea(int w,int h) {
		System.out.println("�簢���� ����:"+(w*h));
	}
}
