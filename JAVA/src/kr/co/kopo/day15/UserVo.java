package kr.co.kopo.day15;

import java.io.Serializable;

/*
 * vo클래스 - value object 값을 가지고 있는 클래스
 * 
 * 기본적 단축키 alt shift s 누른후 
 * c => 기본생성자
 * o => 매개변수 생성자
 * r => getter setter 메소드 생성
 * s => toString()메소드 overriding
 * v => overriding자동완성
 */
public class UserVo implements Serializable{

	public String name;
	public int age;
	public String phone;
	public String addr;
	
	public UserVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserVo(String name, int age, String phone, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.addr = addr;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the addr
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * @param addr the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "UserVo [name=" + name + ", age=" + age + ", phone=" + phone + ", addr=" + addr + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
}
