package MethodTest;
import java.util.Scanner;
public class Major {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("�а��Է�:");
		int major = scan.nextInt( );
		getMajor(major);	
	}//end of main
	public static void getMajor(int m) {
		if(m==1) {
			System.out.print("����Ʈ�����");
		}else if(m==2) {
			System.out.print("���ַ�ǰ�");
		}else if(m==3) {
			System.out.print("�����ΰ�");
		}else {
			System.out.print("ó���Ұ�");
		}
	}
}
