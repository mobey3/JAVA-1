
public class Method1 {

	public static void main(String[] args) {
		// void �����ϸ� ������ ����
		// 1. void mathod1() : �Ű����� X
		// 2. void method2(�Ű�����...) : �Ű����� O
		// Ÿ���� �����ϸ� �ݵ�� return �ʿ�
		// 3. Ÿ�� method3() : Ÿ�԰� ��ġ�ϴ� return�� �ʿ�
		// 4. Ÿ�� method4(�Ű�����...) : return �ʿ�, �Ű����� O
		// 5. ����Լ�

		method1(); // �޼ҵ� ȣ��(���)
		showName();
		showAge();
	}

	public static method1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("method1() ȣ��");
		}
		showName();
		showName("��浿", 200);
	}

	public void showName() {
		String name = "ȫ�浿"
		System.out.println(name);
	}

	public void showAge() {
		System.out.println("100");
	// �����ε�(�ߺ� ����)
	// 1.�Ű����� Ÿ�� �ٸ�
	// 2.�Ű����� ���� �ٸ�
	public static void showName(String name) {
		System.out.println(name);
	}
	public static void showName(string name
		int age) {
		System.out.println("�̸�:" + name + ", ����: " + age);
	}
	public static void showName(int age) {
		System.out.println("�̸�:����ġ" + ", ����:");
	}
	}
}
