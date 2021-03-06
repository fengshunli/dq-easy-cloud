package com.dq.easy.cloud.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@AutoConfigureDataJpa
public class DqEasyCloudPayCoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(DqEasyCloudPayCoreApplication.class, args);
	}
}
