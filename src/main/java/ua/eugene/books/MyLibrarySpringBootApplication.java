package ua.eugene.books;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyLibrarySpringBootApplication {
	static Logger logger = LoggerFactory.getLogger(MyLibrarySpringBootApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(MyLibrarySpringBootApplication.class, args);
		logger.error("Start app");
	}
}
