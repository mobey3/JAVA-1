package com.kjs.carcenterApp.util;

import java.util.Random;

public class RandData {
	String name[] = {"ȫ�浿","��浿","�ڱ浿","�̱浿","�ֱ浿"};
	String tel[] = {"010-1234-5111","010-4444-5522","010-3222-5112",
			"010-5551-0022","010-4112-5451"};
	boolean mCard[] = {true,false};
	String birthday[] = {"1990�� 1��20��","1990�� 2�� 20��","1990�� 3�� 20��",
			"1990�� 4�� 20��","1990�� 5�� 20��"};
	String email[] = {"hong1@naver.com","hong2@naver.com","hong3@naver.com",
			"hong4@naver.com","hong5@naver.com"};
	String model[] = {"SM6","�ҳ�Ÿ","�׷���","���׽ý�","K7"};
	String year[] = {"2018���","2019���","2020���","2021���","2022���"};
	String cause[] = {"�������� ��ü", "������ ��ü","Ÿ�̾� ��ü",
			"���������� ����","���������� ��ü"};
	int dateIn[] = {20210520,20210521,20210522,20210523,20210524};
	int dateOut[] = {20210620,20210621,20210622,20210623,20210624};
	int price[] = {20000,30000,40000,50000,60000};
	boolean isfix[] = {true, false};

	Random r = new Random();
	
	public String getName() {
		return name[r.nextInt(5)];
	}
	
	public String getTel() {
		return tel[r.nextInt(5)];
	}
	
	public boolean getmCard() {
		return mCard[r.nextInt(2)];
	}
	
	public String getBirthday() {
		return birthday[r.nextInt(5)];
	}

	public String getEmail() {
		return email[r.nextInt(5)];
	}
	
	public String getModel() {
		return model[r.nextInt(5)];
	}
	
	public String getYear() {
		return year[r.nextInt(5)];
	}
	
	public String getCause() {
		return cause[r.nextInt(5)];
	}
	
	public int getDateIn() {
		return dateIn[r.nextInt(5)];
	}
	
	public int getDateOut() {
		return dateOut[r.nextInt(5)];
	}
	
	public int getPrice() {
		return price[r.nextInt(5)];
	}
	
	public boolean getIsfix() {
		return isfix[r.nextInt(2)];
	}

}
