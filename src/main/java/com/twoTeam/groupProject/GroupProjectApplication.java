package com.twoTeam.groupProject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class GroupProjectApplication {
	// 測試 branch5-1

	public static void main(String[] args) {
		SpringApplication.run(GroupProjectApplication.class, args);
	}

}
