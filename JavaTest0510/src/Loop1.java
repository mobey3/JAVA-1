import java.util.Random;
import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		for (int i = 1; i <= 100; i++) {
			if (i % 5 ==0) {
				System.out.println("5�� ���: " + i);
			}
		}
	}
	//�ζ� ��ȣ ����
	Random r = new Random(); 
	for (int i = 0; i <= 6; i++) {
	int n = r.nextInt(45) + 1;
	System.out.print(n + " ");
	}
*/	
int sum = 0;
int start = 0;
int end = 0;
Scanner s = new Scanner(System.in);
System.out.print("ù��° ���� �Է�:");
start = s.nextInt();
while (true) {
	System.out.print("�ι�° ���� �Է�:");
	end = s.nextInt();
	if (start >= end) {
		System.out.print("�ι�° ���ڸ� �������� �Է��ϼ���:");
		continue;
	} else {
		break;
	}
}
for (int i = start; i < end; i++) {
	sum += i;
	;
}
System.out.println("�հ�:" + sum);
}
}
