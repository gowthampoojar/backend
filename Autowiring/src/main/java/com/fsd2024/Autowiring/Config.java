package com.fsd2024.Autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
@Configuration
public class Config {
	@Bean (name="add1")
	public Address add1(){
		return new Address ("kattathila","Bantwala","574323");
		
	}
	@Bean (name="add2")
	public Address add2(){
		return new Address ("Salethoor","Bantwala","574323");
		
	}

	@Bean (name="add3")
	public Address add3(){
		return new Address ("Medu","Bantwala");
		
	}
	@Bean
	@Primary
	public ClassStudying cls() {
		return new ClassStudying(5,"cs");
	}
	@Bean
	@Scope("singleton")
	public student student() { 
		return new student ("391CS2013","Gowtham");
	}
}
