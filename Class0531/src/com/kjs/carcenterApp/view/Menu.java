package com.kjs.carcenterApp.view;

import java.util.Scanner;

import com.kjs.carcenterApp.model.Car;
import com.kjs.carcenterApp.model.CarModify;
import com.kjs.carcenterApp.model.Customer;
import com.kjs.carcenterApp.util.Admin;

public class Menu {
	public static final int MAIN_MENU_ADD = 1;
	public static final int MAIN_MENU_VIEW = 2;
	public static final int MAIN_MENU_ADMIN = 3;
	public static final int MAIN_MENU_EXIT = 4;

	public static final int SUB_ADD_RAND = 1;
	public static final int SUB_ADD_INS = 2;
	public static final int SUB_ADD_EXIT = 3;
	
	Scanner s = new Scanner(System.in);

	public int mainMenu() {
		System.out.println("---------------------");
		System.out.println("ī���� ���� ���α׷� v1.0");
		System.out.println("---------------------");
		System.out.println("1.���������");
		System.out.println("2.����������");
		System.out.println("3.������ ���");
		System.out.println("4.���α׷� ����");
		System.out.println("---------------------");
		System.out.print("���� �޴� ����: ");
		return s.nextInt();
	}

	public int addSubMenu() {
		System.out.println("---------------------");
		System.out.println("## ��������� ȭ�� ##");
		System.out.println("---------------------");
		System.out.println("1.������ �ڵ�����");
		System.out.println("2.������ ��������");
		System.out.println("3.���θ޴� �̵�");
		System.out.println("---------------------");
		System.out.print("���� �޴� ����: ");
		return s.nextInt();
	}

	public Customer addManualMenu() {
		System.out.println("---------------------");
		System.out.println("## ��������� �Է� ##");
		System.out.println("---------------------");

		System.out.print("����: ");
		String name = s.next();
		System.out.print("��ȭ: ");
		String tel = s.next();
		System.out.println("�����ī�� ����(Y:true, N:false): ");
		boolean mCard = s.nextBoolean();
		System.out.print("����: ");
		String birthday = s.next();
		System.out.print("�̸���: ");
		String email = s.next();

		System.out.print("������(ex:K7,�׷���): ");
		String model = s.next();
		System.out.print("����(ex:2020���): ");
		String year = s.next();

		System.out.print("��������: ");
		String cause = s.next();
		System.out.print("������¥(ex:20210520): ");
		int dateIn = s.nextInt();
		System.out.print("�����Ϸᳯ¥(ex:20210620): ");
		int dateOut = s.nextInt();
		System.out.print("������(20000): ");
		int price = s.nextInt();
		System.out.print("�����Ϸ�(true / false�� �Է�): ");
		boolean isfix = s.nextBoolean();

		return new Customer(name, tel, mCard, birthday, email, 
				new Car(model, year),
				new CarModify(cause, dateIn, dateOut, price,isfix));

	}
	
	public int getCount() {
		System.out.println("-------------------");
		System.out.println("���� ������ �ڵ� ����");
		System.out.println("-------------------");
		System.out.println("������ ���� �Է�: ");
		return s.nextInt();
	}
	
	public String[] loginAdmin() {
		System.out.println("@@@@@@@@@@@@@@@@@");
		System.out.println("@@@ ������ �α��� @@@");
		System.out.println("@@@@@@@@@@@@@@@@@");
		System.out.print("ID: ");
		String id = s.next();
		System.out.print("PASSWD: ");
		String passwd = s.next();
		String info[] = {id,passwd};
		return info;
	}
	
	public int adminMenu() {
		System.out.println("@@@@@@@@@@@@@@@@@");
		System.out.println("@@@ ������ ��� @@@");
		System.out.println("@@@@@@@@@@@@@@@@@");
		System.out.println("1.���� �����հ�");
		System.out.println("2.�������� ��������");
		System.out.println("3.���θ޴� �̵�");
		System.out.println("-----------------");
		System.out.print("�޴� ����: ");
		return s.nextInt();
	}

}
