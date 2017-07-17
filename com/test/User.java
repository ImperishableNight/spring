package com.test;

public class User {
	private String name;
	private int id;
	private String sex;
	private int age;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(){
		
	}
	public User(String name,int id){
		this.name=name;
		this.id=id;	
	}
	public User(String name){
		this.name=name;
	}
	public User(int id){
		this.id=id;
	}
}
