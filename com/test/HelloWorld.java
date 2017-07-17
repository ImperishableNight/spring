package com.test;

public class HelloWorld {
	private User user;
	private String name;
	public String toString(){
		return "HelloWorld"+this.name;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public HelloWorld(){
        
    }
    
    public HelloWorld(String name){
        this.name = name;
    }
}
