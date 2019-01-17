package org.sl.api;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class TestApplication 
{
private static Logger logger = Logger.getLogger(TestApplication.class);
    
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		 logger.info("SpringBoot Start Success");
	}
}
