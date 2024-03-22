package com.myFirst.firstsApplication.HelloSpring;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application02spring {
	public static void main(String[] args) {
		try(var context =new AnnotationConfigApplicationContext(AppConfiguration.class)){
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean(Address.class));
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}	
	}
}
