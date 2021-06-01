package com.kjs.carcenterApp.util;

import java.util.Random;

public class RandData {
	String name[] = {"홍길동","김길동","박길동","이길동","최길동"};
	String tel[] = {"010-1234-5111","010-4444-5522","010-3222-5112",
			"010-5551-0022","010-4112-5451"};
	boolean mCard[] = {true,false};
	String birthday[] = {"1990년 1월20일","1990년 2월 20일","1990년 3월 20일",
			"1990년 4월 20일","1990년 5월 20일"};
	String email[] = {"hong1@naver.com","hong2@naver.com","hong3@naver.com",
			"hong4@naver.com","hong5@naver.com"};
	String model[] = {"SM6","소나타","그랜저","제네시스","K7"};
	String year[] = {"2018년식","2019년식","2020년식","2021년식","2022년식"};
	String cause[] = {"엔진오일 교체", "와이퍼 교체","타이어 교체",
			"에어컨가스 충전","에어컨필터 교체"};
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
