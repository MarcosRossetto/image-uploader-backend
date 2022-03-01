package com.rossetto.imageuploaderapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ImageuploaderApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageuploaderApiApplication.class, args);
	}

}
