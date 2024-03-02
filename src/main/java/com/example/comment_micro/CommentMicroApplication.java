package com.example.comment_micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class CommentMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentMicroApplication.class, args);
	}

}
