package com.kjs.carcenterApp.Controller;

import java.util.ArrayList;

import com.kjs.carcenterApp.model.Car;
import com.kjs.carcenterApp.model.CarModify;
import com.kjs.carcenterApp.model.Customer;
import com.kjs.carcenterApp.util.Admin;
import com.kjs.carcenterApp.util.CommUtil;
import com.kjs.carcenterApp.util.RandData;
import com.kjs.carcenterApp.view.Menu;



public class CarController {
	//제네릭 + 컬렉션
	Menu m;
	ArrayList<Customer> custList = 
			new ArrayList<Customer>();
	
	public CarController(Menu m) {
		this.m = m;
	}
	
	public void addRandCustData(Customer cust) {
		custList.add(cust);
	}
	public void addRandCustData(int size,RandData rand) {
		for(int i = 0; i < size; i++) {
		custList.add(new Customer
				   (rand.getName(),
					rand.getTel(),
					rand.getmCard(),
					rand.getBirthday(),
					rand.getEmail(),
					new Car(rand.getModel(),
							rand.getYear()),
					new CarModify(rand.getCause(),
							rand.getDateIn(),
							rand.getDateOut(),
							rand.getPrice(),
							rand.getIsfix())));
		}
	}
	
	public void addCustData(Customer cust) {
		custList.add(cust);
	}
	
	public void viewCistData() {
		for (int i = 0; i < custList.size(); i++) {
			System.out.println(
					custList.get(i).toString());
		}
	}
	
	public void doAddWork(Menu m, RandData rand) {
		while (true) {
			int menu = m.addSubMenu();
			if (menu == Menu.SUB_ADD_RAND) {
				System.out.println("자동 생성");
				addRandCustData(m.getCount(),rand);
				
				}
				
			
			else if (menu == Menu.SUB_ADD_INS) {
				System.out.println("수동 입력");
				addCustData(m.addManualMenu());
				break;
				
			}
			else if (menu == Menu.SUB_ADD_EXIT) {
				break;
			}
		}
	}
	
	public boolean doAdminLogin(Menu m) {
		while (true) {
			String info[] = m.loginAdmin();
		if (info[0].equals(Admin.ADMIN_ID) == false ) {
			System.out.println("잘못된 ID 입니다.");
			continue;
		}
		else if (info[1].equals(Admin.ADMIN_PASSWD) == false) {
			System.out.println("잘못된 PASSWD 입니다.");
			continue;
		}
		else return true;
		}
	}
	
	public void doAdminWork(Menu m) {
		for(;;) {
			int menu = m.adminMenu();
			if (menu ==1) {
				System.out.println("일일 매출액: " +dayOfSell());
			}
			else if (menu == 2) {
				System.out.println("차량수리 내역보기");
			}
			else if (menu == 3) break; 
		}
	}
	
	public String dayOfSell() {
		int sum =0;
		for(int i = 0; i < custList.size(); i++) {
			sum += custList.get(i).getCarModify().getPrice();
		}
		return CommUtil.getKorMoney(sum);
	}
	
	public void showFixList() {
		//이름, 전화번호, 차종, 수리완료여부
	}

	
	
	

}
