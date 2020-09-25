package MethodTest;
import java.util.Scanner;
/*이전에 작업했던 Square.java(직사각형 모양의 땅 면적을 계산하여 출력하는 프로그램을 설계한 후 작성하라.
 * 땅의 가로 길이는 100m이고 세로 길이는 50m 이다.)
 * 의 사각형의 넓이를 구하는 메서드를 작성하여 동작하도록 수정하라.
 */
public class Square_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSquareArea();
	}//end of main

	public static void getSquareArea() {
		Scanner scan= new Scanner(System.in);
		int width, height;
		System.out.print("가로 입력:");
		width=scan.nextInt();
		System.out.print("세로 입력:");
		height=scan.nextInt();
		System.out.println("사각형의 넓이:"+(width*height));
	}
}
