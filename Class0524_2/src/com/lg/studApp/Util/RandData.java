package com.lg.studApp.Util;

import java.util.Random;

public class RandData {
	String name[] = {"ȫ�浿","�̼���","������","������","���ȯ"};
	int age[] = {50,51,52,53,53};
	char gender[] = {'��','��'};
	String address[] = {"�뱸�� ���� ��õ1��","�뱸�� ���� ��õ2��",
			"�뱸�� ���� ��õ3��","�뱸�� ���� ��õ4��",
			"�뱸�� ���� ��õ5��"};
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
