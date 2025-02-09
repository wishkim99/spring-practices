package com.poscoict.container.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.poscoict.container.config.user.AppConfig01;
import com.poscoict.container.user.User;

public class AppConfigTest {

	public static void main(String[] args) {
		testAppConfig01();
	}

	//Java Config1
	//직접 자바 클래스(config class)를 전달
	public static void testAppConfig01() {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig01.class);
		
		User user=ac.getBean(User.class);
		System.out.println(user);
	}
	
	//Java Config2
	//자바 설정 클래스가 모여있는 베이스패키지 전달
	//설정 클래스에 @Configuration이 ㅂ반드시 필요하다.
	public static void testAppConfig02() {
		ApplicationContext ac=new AnnotationConfigApplicationContext("com.poscoict.container.config.user");
		
		User user=ac.getBean(User.class);
		System.out.println(user);
	}
}
