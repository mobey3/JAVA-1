import java.util.Scanner;

public class JavaExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 간단한 계산기 프로그램 v1.0
		// 1.숫자1 입력: 20
		// 2.숫자2 입력: 10
		// 3.연산자 입력(+,-,*,/): +
		// 출력 형태: 20 + 10 = 30
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1 입력: ");
		int num1 = sc.nextInt();
		System.out.println("숫자2 입력: ");
		int num2 = sc.nextInt();
		System.out.println("연산자 입력(+,-,*,/): ");
		String op = sc.next();
		
		if (op=="+") {//자바=println c=printf
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
		}
		else if (op=="-") {
			System.out.println(num1-num2);
			
		}
		else if (op=="*") {
			System.out.println();
		}
			
		sc.close();
		
		
	}

}
