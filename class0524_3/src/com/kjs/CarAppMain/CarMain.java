package com.kjs.CarAppMain;

import java.util.Random;

import com.kjs.CarApp.car.Car;

import kjs.carApp.customer.Customer;

public class CarMain {

	public static void main(String[] args) {
		String name[] = {"�̼���","ȫ�浿","��ù�","���߱�","����ȣ"};
		String tel[] = {"010-1234-5678","010-4321-6789","010-3478-1278",
				"010-4523-1978","010-7890-2134"};
		String address[] = {"�뱸�� ���� �ž�4��","����� ������ ���ʵ�",
				"�뱸 �޼��� ���ε�","�뱸 ���� �ż���","�뱸 �ϱ� ĥ����"};
		String model[] = {"SM6","�Ÿ","��Ÿ��","K7","�׷���"};
		String color[] = {"��","����","���","ȸ��","����"};
		int[] year = {2016,2017,2020,2016,2019};
		String company[] = {"����Ｚ","����","����","���","����"};

		Customer[] arr = new Customer[10];
		Random r = new Random();
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Customer(name[r.nextInt(5)],
					tel[r.nextInt(5)],
					address[r.nextInt(5)],
					new Car(model[r.nextInt(5)],
							color[r.nextInt(5)],
							year[r.nextInt(5)],
							company[r.nextInt(5)]));
			System.out.println("��ȣ: " + (i+1));
		
			arr[i].printCustomerInfo();
		}

	}

}
