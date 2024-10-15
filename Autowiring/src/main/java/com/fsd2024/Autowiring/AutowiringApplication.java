package com.fsd2024.Autowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutowiringApplication {

	public static void main(String[] args) {
		
				ConfigurableApplicationContext cn=SpringApplication.run(AutowiringApplication.class, args);
				student S1=cn.getBean(student.class);
				System.out.println("Hello");
				System.out.println(S1);
				System.out.println(S1.hashCode());
				
				student S2=cn.getBean(student.class);
				System.out.println("Hello");
				System.out.println(S2);
				System.out.println(S2.hashCode());
			}

	}