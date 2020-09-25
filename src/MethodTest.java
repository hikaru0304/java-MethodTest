import java.util.Scanner;
public class MethodTest {

	public static void main(String[] args) {
		// 학번과 이름을 입력받아 출력하는 메서드를 작성
		/*사용자에게 보여지는 코드=> 서비스 코드
		 * 뭘 할지는 알아(메서드 이름을 통해서)
		 * 그 안의 소스 코드는 안보여=>캡슐화
		 */
		getName();

	}
	public static void getName() {
		int hakbun;
		String name;
		Scanner scan= new Scanner(System.in);
		hakbun= scan.nextInt();
		name=scan.next();
		System.out.println("학번:"+hakbun+"이름:"+name);
	}

}
