package cn.ekgc.witmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WitmedRegistry {
	public static void main(String[] args) {
		SpringApplication.run(WitmedRegistry.class, args);
	}
}
