package com.kjs.carcenterApp.model;

public class Car {
	private String model;
	private String year;
	
	public Car(String model, String year) {
		super();
		this.model = model;
		this.year = year;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		String str = "��������: " + model + "\n";
		str += "����: " + year + "\n"; 
		return str;
	}
	
	
	
	
}
