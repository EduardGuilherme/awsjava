package br.com.java.aws.JavaAws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JavaAwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaAwsApplication.class, args);
		System.out.println("ok");
	}

}
