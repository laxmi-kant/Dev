package com.java.self.practice.Laxmikantbio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@EnableAutoConfiguration
@ComponentScan("com.java.self.practice.Laxmikantbio")
@SpringBootApplication
public class LaxmikantBioApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaxmikantBioApplication.class, args);
	}
}
