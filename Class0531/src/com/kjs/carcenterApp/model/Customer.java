package com.kjs.carcenterApp.model;

public class Customer {
	private String name;
	private String tel;
	private boolean mCard; // ����� ī�� 5%dc
	private String birthday;
	private String email;
	private Car car;
	private CarModify carModify;

	public Customer(String name, String tel, boolean mCard, String birthday, String email) {
		super();
		this.name = name;
		this.tel = tel;
		this.mCard = mCard;
		this.birthday = birthday;
		this.email = email;
	}
	
	
	public Customer(String name, String tel, boolean mCard, String birthday, String email, Car car,
			CarModify carModify) {
		super();
		this.name = name;
		this.tel = tel;
		this.mCard = mCard;
		this.birthday = birthday;
		this.email = email;
		this.car = car;
		this.carModify = carModify;
	}



	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	public CarModify getCarModify() {
		return carModify;
	}


	public void setCarModify(CarModify carModify) {
		this.carModify = carModify;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public boolean ismCard() {
		return mCard;
	}

	public void setmCard(boolean mCard) {
		this.mCard = mCard;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		String str = "�̸�: " + name +"\n";
		str += "��ȭ: " + tel + "\n";
		str += "�����ī��: " + mCard + "\n";
		str += "����: " + birthday + "\n";
		str += "E-mail: " + email + "\n\n";
		str += car.toString() + "\n";
		str += carModify.toString() +"\n";

		return str;
	}
	
	
	

}
