package MethodTest;
/*�� ���� �Է¹޾� ��Ҹ� ���ϴ� �޼��� �ۼ�
 * compareOfTwo(           )
 */
import java.util.Scanner;
public class CompareTwo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int a,b;
		System.out.print("ù��° �� �Է�:");
		a=scan.nextInt();
		System.out.print("�ι�° �� �Է�:");
		b=scan.nextInt();
		compareTwo(a,b);
	}//end of main
	public static void compareTwo(int one, int two) {
		if(one>two) {
			System.out.print("�� ū ����"+one+"�̴�");
		}else if(two>one){
			System.out.print("�� ū ����"+two+"�̴�");
		}else {
			System.out.print(one+"��"+two+"�� ����");
		}
	}

}
