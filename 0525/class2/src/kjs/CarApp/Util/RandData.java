package kjs.CarApp.Util;

import java.util.Random;

public class RandData {
	String name[] = {"�̼���","ȫ�浿","��ù�","���߱�","����ȣ"};
	String tel[] = {"010-1234-5678","010-4321-6789","010-3478-1278",
			"010-4523-1978","010-7890-2134"};
	String address[] = {"�뱸�� ���� �ž�4��","����� ������ ���ʵ�",
			"�뱸 �޼��� ���ε�","�뱸 ���� �ż���","�뱸 �ϱ� ĥ����"};
	String model[] = {"SM6","�Ÿ","��Ÿ��","K7","�׷���"};
	String color[] = {"��","����","���","ȸ��","����"};
	int[] year = {2016,2017,2020,2016,2019};
	String company[] = {"����Ｚ","����","����","���","����"};

	Random r = new Random();
	
	public String getName() {
		return name[r.nextInt(5)];
	}
	
	public String getTel() {
		return tel[r.nextInt(5)];
	}
	
	public String getAddress() {
		return address[r.nextInt(5)];
	}
	
	public String getModel() {
		return model[r.nextInt(5)];
	}
	
	public String getColor() {
		return color[r.nextInt(5)];
	}
	
	public int getYear() {
		return year[r.nextInt(5)];
	}
	
	public String getCompany() {
		return company[r.nextInt(5)];
	}

}
