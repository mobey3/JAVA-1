package com.kjs.carcenterApp;

import com.kjs.carcenterApp.Controller.CarController;
import com.kjs.carcenterApp.model.Car;
import com.kjs.carcenterApp.model.CarModify;
import com.kjs.carcenterApp.model.Customer;
import com.kjs.carcenterApp.util.Admin;
import com.kjs.carcenterApp.util.RandData;
import com.kjs.carcenterApp.view.Menu;

public class CarCenterMain {

	private static Object id;

	public static void main(String[] args) {
		Menu m = new Menu();
		RandData rand = new RandData();
		CarController con = new CarController(m);
		Admin com = new Admin();
		
		while (true) {
			switch(m.mainMenu()) {
			case Menu.MAIN_MENU_ADD:
				System.out.println("������ ����ϱ�");
//				while (true) {
//					int menu = m.addSubMenu();
//					if (menu == Menu.SUB_ADD_RAND) {
//						System.out.println("�ڵ� ����");
//						con.addRandCustData(m.getCount(),rand);
//						
//						}
//						
//					
//					else if (menu == Menu.SUB_ADD_INS) {
//						System.out.println("���� �Է�");
//						con.addCustData(m.addManualMenu());
//						break;
//						
//					}
//					else if (menu == Menu.SUB_ADD_EXIT) {
//						break;
//					}
					
//					switch(m.addSubMenu()){
//						case Menu.SUB_ADD_RAND:
//							System.out.println("������ ��������");
//							continue;
//						case Menu.SUB_ADD_INS:
//							System.out.println("������ �����Է�");
//							continue;
//						case Menu.SUB_ADD_EXIT:
//							System.out.println("���θ޴� �ǵ�����");
//							break;
//					}
//					break;
//				}
//				break;
				con.doAddWork(m,rand);
			case Menu.MAIN_MENU_VIEW:
				con.viewCistData();
				break;
			case Menu.MAIN_MENU_ADMIN:
				System.out.println("������ ���");
				if(con.doAdminLogin(m)==true);{
					con.doAdminWork(m);
				}
				break;
			
			case Menu.MAIN_MENU_EXIT:
				System.out.println("### ���α׷� ���� ###");
				System.exit(0);
				
			}
		}

	}

}
