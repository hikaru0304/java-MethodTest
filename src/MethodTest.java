import java.util.Scanner;
public class MethodTest {

	public static void main(String[] args) {
		// �й��� �̸��� �Է¹޾� ����ϴ� �޼��带 �ۼ�
		/*����ڿ��� �������� �ڵ�=> ���� �ڵ�
		 * �� ������ �˾�(�޼��� �̸��� ���ؼ�)
		 * �� ���� �ҽ� �ڵ�� �Ⱥ���=>ĸ��ȭ
		 */
		getName();

	}
	public static void getName() {
		int hakbun;
		String name;
		Scanner scan= new Scanner(System.in);
		hakbun= scan.nextInt();
		name=scan.next();
		System.out.println("�й�:"+hakbun+"�̸�:"+name);
	}

}
