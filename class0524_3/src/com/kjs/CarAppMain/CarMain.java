package com.kjs.CarAppMain;

import java.util.Random;

import com.kjs.CarApp.car.Car;

import kjs.carApp.customer.Customer;

public class CarMain {

	public static void main(String[] args) {
		String name[] = {"이순신","홍길동","김시민","안중근","박찬호"};
		String tel[] = {"010-1234-5678","010-4321-6789","010-3478-1278",
				"010-4523-1978","010-7890-2134"};
		String address[] = {"대구시 동구 신암4동","서울시 강남구 서초동",
				"대구 달서구 상인동","대구 동구 신서동","대구 북구 칠성동"};
		String model[] = {"SM6","쏘나타","싼타페","K7","그랜져"};
		String color[] = {"블랙","은색","흰색","회색","빨강"};
		int[] year = {2016,2017,2020,2016,2019};
		String company[] = {"르노삼성","현대","현대","기아","현대"};

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
			System.out.println("번호: " + (i+1));
		
			arr[i].printCustomerInfo();
		}

	}

}
