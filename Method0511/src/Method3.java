
public class Method3 {

	public static void main(String[] args) {
		// Ÿ�� �޼����̸�()
		System.out.println("����: " + getAge());
		System.out.println("�̸�: " + getName());
		System.out.println("����: " + getAge(100));
		System.out.println("�̸�: " + getName("��"));
	}
	
	public static int getAge() {
		int age = 100;
		return age; //��������
	}
	
	public static String getName() {
		String name = "ȫ�浿";
		return name;		
	}
	
	public static String getName(String lastName) {
		return lastName + "�浿";
	}
	
}
