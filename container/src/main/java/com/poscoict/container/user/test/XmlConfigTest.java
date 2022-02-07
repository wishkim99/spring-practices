package com.poscoict.container.user.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.poscoict.container.user.User1;

public class XmlConfigTest {

	public static void main(String[] args) {
//		testBeanFactory01();
		testBeanFactory02();

	}

	// XML Auto Configuration(Annotation Scanning)=> 자동 설정
	// applicationContext01에서 설정
	private static void testBeanFactory01() {
		BeanFactory bf = new XmlBeanFactory(
				new ClassPathResource("com/poscoict/container/config/user/applicationContext01.xml")); // ""안에는 설정파일
		User1 user1 = bf.getBean(User1.class); // User1 타입으로 리턴
		System.out.println(user1.getName());

		// bean id가 자동으로 설정됨
		user1 = (User1) bf.getBean("user1"); // string은 object 타입으로 리턴
		// 다운캐스팅은 명시적으로
		System.out.println(user1.getName());
	}

	// XML Explicit Configuration(Explicit Configuration)
	private static void testBeanFactory02() {// bean factory 인터페이스를 구현
		BeanFactory bf = new XmlBeanFactory(
				new ClassPathResource("com/poscoict/container/config/user/applicationContext02.xml")); // ""안에는 설정파일
		User1 user1 = bf.getBean(User1.class); // User1 타입으로 리턴
		System.out.println(user1.getName());

		// Bean id가 자동으로 설정되지 않음
		//명시적으로 설정 해야한다.
		user1 = (User1) bf.getBean("user1"); // string은 object 타입으로 리턴	
		System.out.println(user1.getName());

	}

}
