package com.carvajal.ecmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication //(exclude= DataSourceAutoConfiguration.class)
public class CvlEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvlEcommerceApplication.class, args);
	}

}
