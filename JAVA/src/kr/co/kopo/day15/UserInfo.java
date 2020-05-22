package kr.co.kopo.day15;

import java.beans.Transient;
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
public class UserInfo implements Serializable {

	private 		  String name;
	private transient int age; // 객체 직렬화 할때 빼고 하는 것
	private 		  String addr;
	
	public UserInfo() {
		super();
		}

	public UserInfo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
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
		return "UserInfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
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
