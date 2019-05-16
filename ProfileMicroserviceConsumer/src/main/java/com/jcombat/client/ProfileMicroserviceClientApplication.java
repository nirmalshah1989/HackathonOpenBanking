package com.jcombat.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class ProfileMicroserviceClientApplication {
	
	public static final String ING_SERVICE_URL = "http://ING-MICROSERVICES";
	public static final String BNP_SERVICE_URL = "http://BNP-MICROSERVICES";
	
	public static void main(String[] args) {
		SpringApplication.run(ProfileMicroserviceClientApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Bean
	public TransactionRepository transactionRepositoryING(){
		return new RemoteTransactionRepositoryING(ING_SERVICE_URL);
	}
	
}