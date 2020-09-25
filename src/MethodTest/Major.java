package MethodTest;
import java.util.Scanner;
public class Major {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("학과입력:");
		int major = scan.nextInt( );
		getMajor(major);	
	}//end of main
	public static void getMajor(int m) {
		if(m==1) {
			System.out.print("소프트웨어과");
		}else if(m==2) {
			System.out.print("웹솔루션과");
		}else if(m==3) {
			System.out.print("디자인과");
		}else {
			System.out.print("처리불가");
		}
	}
}
