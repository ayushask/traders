package com.traders.traders;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.TemplateEngine;

import nz.net.ultraq.thymeleaf.LayoutDialect;

@SpringBootApplication
public class TradersApplication {

	public static void main(String[] args) {
		TemplateEngine templateEngine = new TemplateEngine();  // Or SpringTemplateEngine for Spring
		templateEngine.addDialect(new LayoutDialect());
		 SpringApplication.run(TradersApplication.class, args);
		

	}
	
	@Bean
	public LayoutDialect layoutDialect() {
	    return new LayoutDialect();
	}
	
}
