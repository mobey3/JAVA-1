import java.util.Random;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		Random r = new Random();
		for (int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(100)+1;
		}
		checkOddEven(arr);//�Ű����� ����
		
		String strArr[] = getOddEven(arr);
		
		
	}

	private static void checkOddEven(int arr[]) {
		// TODO Auto-generated method stub
		for (int i=0; i<arr.length; i++) {
			if (arr[i] % 2 ==0) {
				System.out.println(arr[i] + ":¦��");
			}
			else {
				System.out.println(arr[i] + ":Ȧ��");
			}
		}

	}
	private static void getOddEven(int arr[]) {
		String strArr[] = new String[10];
		for (int i=0; i<arr.length; i++) {
			if (arr[i] % 2 ==0) {
				strArr[i] = ":¦��";
			}
			else {
				strArr[i] = ":Ȧ��";
			}
		}

	}
}
