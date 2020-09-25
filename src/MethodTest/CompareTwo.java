package MethodTest;
/*두 수를 입력받아 대소를 비교하는 메서드 작성
 * compareOfTwo(           )
 */
import java.util.Scanner;
public class CompareTwo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int a,b;
		System.out.print("첫번째 수 입력:");
		a=scan.nextInt();
		System.out.print("두번째 수 입력:");
		b=scan.nextInt();
		compareTwo(a,b);
	}//end of main
	public static void compareTwo(int one, int two) {
		if(one>two) {
			System.out.print("더 큰 수는"+one+"이다");
		}else if(two>one){
			System.out.print("더 큰 수는"+two+"이다");
		}else {
			System.out.print(one+"과"+two+"는 같다");
		}
	}

}
