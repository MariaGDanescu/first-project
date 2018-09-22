package com.buyIT.web.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.buyIT.web")
/**
 * 
 * @author MariaDanescu
 *
 */
public class BuyITMainApp {

	public static void main(String[] args) {
		SpringApplication.run(BuyITMainApp.class, args);
	}
}
