import java.util.Scanner;

public class Loop2 {
	public static final int MENU_FILE_WHITE = 1;
	public static final int MENU_FILE_READ = 2;
	public static final int MENU_FILE_EXIT = 3; //�������

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);		
		while (true) { //�ݺ�
			System.out.print("========================");
			System.out.print("������ ���� ���� ���α׷� v1.0");
			System.out.print("========================");
			System.out.print("1.���� ���� �� ����");
			System.out.print("2.���� �б�");
			System.out.print("3.����");
			System.out.print("========================");
			System.out.print("�޴��� �����ϼ���");
			int menu = s.nextInt(); // �Է¹���

			switch (menu) {
			case MENU_FILE_WHITE:
				System.out.println("���� ���� �� ����");
				break;
			case MENU_FILE_READ:
				System.out.println("���� �б�");
				break;
			case MENU_FILE_EXIT:
				System.out.println("����");
				s.close();
				System.exit(0); // ����
				break;
			}

		}
	}
}
