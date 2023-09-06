package com.dongguo.tacocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TacoCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
		System.out.println("SpringDoc url: http://127.0.0.1:9000/swagger-ui.html");
	}

}
