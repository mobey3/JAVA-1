package kjs.CarApp.Main;

import kjs.CarApp.handler.CarSellMgr;
import kjs.CarApp.view.Menu;

public class CarMain {
	public static void main(String[] args) {
      Menu m = new Menu();
      CarSellMgr a = new CarSellMgr();
	 while (true) {
			switch (m.mainMenu()) {
				case Menu.MAIN_MENU_VIEW:
				    a.showSellInfo();
				    break;
				case Menu.MAIN_MENU_RAND_INS:
				    a.randInsData(m.getRandCnt());
					break;
				case Menu.MAIN_MENU_INS:
					System.out.println("중고차 매매 수동 자료 추가");
					break;
				case Menu.MAIN_MENU_EXIT:
					a.mainExit();
				default:
					System.out.println("올바른 메뉴를 선택하세요.");
	            }

 	    }
	}
}