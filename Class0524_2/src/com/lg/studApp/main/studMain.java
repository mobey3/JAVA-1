package com.lg.studApp.main;

//import java.util.Random;

import com.lg.studApp.Util.RandData;
import com.lg.studApp.model.Student;


public class studMain {

	public static void main(String[] args) {
		String name[] = {"홍길동","이순신","강감찬","김좌진","김두환"};
		int age[] = {50,51,52,53,53};
		char gender[] = {'남','여'};
		String address[] = {"대구시 동구 신천1동","대구시 동구 신천2동",
				"대구시 동구 신천3동","대구시 동구 신천4동",
				"대구시 동구 신천5동"};
		
		Student arr[] = new Student[10];
//		Random r = new Random();
		RandData r = new RandData();
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = new Student(
					r.getName(),
					r.getAge(),
					r.getGender(),
					r.getAddress());
			System.out.println("번호: " + (i+1));
			arr[i].showStInfo();
		}
		arr[9] = new Student("전우치",24,'남',"조선 한양인근 두메산골");
		arr[9].showStInfo();
		

	}

}


