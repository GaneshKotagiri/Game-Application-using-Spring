package com.myFirst.firstsApplication.HelloSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
record Name(String FirstName) {};
//record Name1(String FirstName, int age) {};
record Address(String BuildingName,int HNo) {};
record Person(Name name,int age,Address address) {};

@Configuration
public class AppConfiguration{

	@Bean
	public Name name1() {
		return new Name("Ganesh");
	}@Bean
	public int age() {
		return 23;
	}
	@Bean
	@Primary
	public Address MyAdd() {
		return new Address("707 MLK", 202);
	}
	@Bean
	@Qualifier("AddressQualifier")
	public Address MyAdd1() {
		return new Address("727 MLk", 204);
	}@Bean
	public Person person1( Name name1,int age, @Qualifier("AddressQualifier") Address MyAdd) {
		return new Person(name1,age,MyAdd);
	}
	
	
	
}
