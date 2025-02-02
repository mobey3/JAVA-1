package kjs.CarApp.handler;

import java.util.ArrayList;

import kjs.CarApp.Customer.Customer;
import kjs.CarApp.Util.RandData;
import kjs.CarApp.car.Car;

public class CarSellMgr {
	ArrayList<Customer> cuList = 
		new ArrayList<Customer>();
	RandData r = new RandData();
	
	public void showSellInfo() {
		for (Customer cu : cuList) {
			cu.printCustomerInfo();
		}
	}
	
	public void randInsData() {
		cuList.add(new Customer(r.getName(),
				r.getTel(),r.getAddress(),
				new Car(r.getModel(),r.getColor(),r.getYear(),
				r.getCompany())));
	}
	
	public void randInsData(int size) {
		for(int i = 0; i < size; i++) {
			cuList.add(new Customer(r.getName(),
					r.getTel(),r.getAddress(),
					new Car(r.getModel(),r.getColor(),r.getYear(),
					r.getCompany())));
		}
		
		
		
	}
	
	public void insData() {
		
	}
	
	public void mainExit() {
		System.exit(0);
	}

}
