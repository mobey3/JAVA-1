package kjs.CarApp.Main;
import java.util.ArrayList;
import kjs.CarApp.Customer.Customer;
import kjs.CarApp.Customer.RandData;
import kjs.CarApp.car.Car;

public class CarMain {
	public static void main(String[] args) {
		Customer[] cu = new Customer[10];
		//제네릭 + 컬렉션 클래스
		ArrayList<Customer> arrList =
				new ArrayList<Customer>();
		RandData r = new RandData();
		for(int i = 0; i < cu.length; i++) {
			System.out.println("번호: " + (i+1));
			cu[i] = new Customer(r.getName(),
					r.getTel(), r.getAddress(),
					new Car(r.getModel(),
							r.getColor(),r.getYear(),
							r.getCompany()));
			cu[i].printCustomerInfo();
			arrList.add(cu[i]);
		}
		
		for (int i = 0; i < arrList.size(); i++) {
//			Customer cuList = arrList.get(i);
//			cuList.printCustomerInfo();
			arrList.get(i).printCustomerInfo();
		}

		

	}

}
