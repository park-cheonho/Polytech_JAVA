package kr.ac.kopo.day17.homework;

import java.util.Random;

class Account {

	private Random r = new Random();
	private String name;
	private int money;
	private int balance;

	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}

	public synchronized void deposit(String name) {
		
//		notifyAll();
		//money = (r.nextInt(10) + 1) * 1000;
		money = (int)(Math.random()*9000) + 1000;
		System.out.println(name + " 손님이" + money + " 원 입금 하셨습니다.");
		balance += money;
		System.out.println("현재 잔액은 " + balance + "원입니다.");
//		try {
//			//notifyAll();
//			wait();
//			notifyAll();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}

	public synchronized void withdraw(String name) {
		
//		notifyAll();
		//money = (r.nextInt(10) + 1) * 1000;
		money = (int)(Math.random()*9000) + 1000;
		if (balance - money < 0 && balance < money) {
			System.out.println(name + "손님의 출금금액 : " + money + " 원 => 잔액이 부족하여 출금을 할 수 없습니다. 현재 최대 출금 가능 금액 : " + balance);
		}else {
			System.out.println(name + "손님이" + money + " 원 출금 하셨습니다.");
			balance -= money;
		}
		System.out.println("현재 잔액은 " + balance + "원입니다.");
//		try {
//			notifyAll();
//			wait();
//			notifyAll();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
}

class Users extends Thread {

	private String name;
	private Account account;

	public Users(String name, Account account) {
		this.name = name;
		this.account = account;
	}

	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			account.deposit(name);
			account.withdraw(name);
		}
	}
}

public class AccountMain {

	public static void main(String[] args) {

		Account ac = new Account("홍길동", 10000);

		Users user1 =  new Users("홍길동", ac);
		Users user2 =  new Users("어머니", ac);
		Users user3 =  new Users("아버지", ac);

		user1.start();
		user2.start();
		user3.start();
	}
}
