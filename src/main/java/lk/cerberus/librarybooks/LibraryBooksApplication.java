package lk.cerberus.librarybooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class LibraryBooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryBooksApplication.class, args);
	}

}
