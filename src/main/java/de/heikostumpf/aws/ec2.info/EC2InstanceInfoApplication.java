package de.heikostumpf.aws.ec2.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class EC2InstanceInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EC2InstanceInfoApplication.class, args);
	}
}
