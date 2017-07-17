package com.test;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	public static void main(String[] args) {
		 ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
	        User u = (User)context.getBean("User");
	        HelloWorld h=(HelloWorld) context.getBean("HelloWorld");
	        User u1=(User) context.getBean("Usera");
	        int i=new Integer(1);
	        System.out.println(u1.getName()+" "+u1.getId());
	        System.out.println(u.getAge());
	        System.out.println(h);
	        List list=h.getList();
	        System.out.println(list.get(1));
	        System.out.println(h.getUser().getAge());
	}
}
