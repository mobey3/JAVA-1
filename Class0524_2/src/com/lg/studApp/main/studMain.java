package com.lg.studApp.main;

//import java.util.Random;

import com.lg.studApp.Util.RandData;
import com.lg.studApp.model.Student;


public class studMain {

	public static void main(String[] args) {
		String name[] = {"ȫ�浿","�̼���","������","������","���ȯ"};
		int age[] = {50,51,52,53,53};
		char gender[] = {'��','��'};
		String address[] = {"�뱸�� ���� ��õ1��","�뱸�� ���� ��õ2��",
				"�뱸�� ���� ��õ3��","�뱸�� ���� ��õ4��",
				"�뱸�� ���� ��õ5��"};
		
		Student arr[] = new Student[10];
//		Random r = new Random();
		RandData r = new RandData();
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = new Student(
					r.getName(),
					r.getAge(),
					r.getGender(),
					r.getAddress());
			System.out.println("��ȣ: " + (i+1));
			arr[i].showStInfo();
		}
		arr[9] = new Student("����ġ",24,'��',"���� �Ѿ��α� �θ޻��");
		arr[9].showStInfo();
		

	}

}


