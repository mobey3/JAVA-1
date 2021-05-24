package com.lg.studApp.Util;

import java.util.Random;

public class RandData {
	String name[] = {"홍길동","이순신","강감찬","김좌진","김두환"};
	int age[] = {50,51,52,53,53};
	char gender[] = {'남','여'};
	String address[] = {"대구시 동구 신천1동","대구시 동구 신천2동",
			"대구시 동구 신천3동","대구시 동구 신천4동",
			"대구시 동구 신천5동"};
	Random r = new Random();
	
	public String getName() {
		return name[r.nextInt(5)];
	}
	
	public int getAge() {
		return age[r.nextInt(5)];
	}
	
	public char getGender() {
		return gender[r.nextInt(2)];
	}
	
	public String getAddress() {
		return address[r.nextInt(5)];
	}
}
