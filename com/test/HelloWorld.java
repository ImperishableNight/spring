package com.test;

import java.util.List;
import java.util.Map;

public class HelloWorld {
	private List<String> list;
	private Map<String,Integer> map;
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
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<String,Integer> getMap() {
		return map;
	}
	public void setMap(Map<String,Integer> map) {
		this.map = map;
	}
}
