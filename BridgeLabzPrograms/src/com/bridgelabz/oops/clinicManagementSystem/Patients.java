package com.bridgelabz.oops.clinicManagementSystem;
/**
 * Patient POJO Class for Clinic Management
 * *********************************************/
public class Patients {

	private String name;
	private int id;
	 private String phone;
	private int age;

	public Patients() {

	}

	public Patients(int id, String name, String phone, int age) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return (name + "   " + id + "    " + age + "   " + phone);
	}

}
