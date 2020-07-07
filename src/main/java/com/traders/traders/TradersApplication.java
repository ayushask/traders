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

	private static String moveForwardX(int wordLength, int x, int yFixed, String[][] arr) {
		String a = new String();
		for (int i = x; i < arr.length; i++) {

			a = a + arr[yFixed][i];

			if (a.length() == wordLength) {
				break;
			}

		}
		System.out.println("Forward :" + a);
		return a;
	}
	
	private static String moveBackWordX(int wordLength, int x, int yFixed, String[][] arr) {
		String a = new String();
		for (int i = arr.length -1; i >= x ; i--) {

			a = a + arr[yFixed][i];

			if (a.length() == wordLength) {
				break;
			}

		}
		System.out.println("BK X: " + a);
		return a;
	}
	
	private static String moveForwardY(int wordLength, int x, int yFixed, String[][] arr) {
		String a = new String();
		for (int i = x; i < arr.length; i++) {

			a = a + arr[i][yFixed];

			if (a.length() == wordLength) {
				break;
			}

		}
		System.out.println("Forward  Y:" + a);
		return a;
	}

	private static String moveBackWordY(int wordLength, int x, int yFixed, String[][] arr) {
		String a = new String();
		for (int i = arr.length -1; i >= x ; i--) {

			a = a + arr[i][yFixed];

			if (a.length() == wordLength) {
				break;
			}

		}
		System.out.println("BK Y: " + a);
		return a;
	}
	
	private static String moveDiagonalXD(int wordLength, int x, int yFixed, String[][] arr) {
		String a = new String();
		int temp = 0;
		for (int i = x; i < arr.length; i++) {
			a = a + arr[i][i];

			if (a.length() == wordLength) {
				break;
			}

		}
		System.out.println("Forward  Y:" + a);
		return a;
	}
	
}
