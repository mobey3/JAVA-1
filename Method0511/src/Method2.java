import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° �� �Է�");
		int num1 = s.nextInt();
		System.out.println("�ι�° �� �Է�");
		int num2 = s.nextInt();
		System.out.println("������ �Է�(+,-,*,/): ");
		String op = s.next();
		calcu(num1, num2, op);

	}
	// ������ ��Ģ���� ����
	public static void calcu(int num1, int num2, String op) {
		switch (op) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2);
			break;
		}
	}
}
