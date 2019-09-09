package indi.jsees.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer           // EurekaServer 服务器端启动类，接收其他微服务注册进来
public class EurekaServer7002_App {
	
	public static void main(String[] args) {
		
		SpringApplication.run(EurekaServer7002_App.class, args);
		System.out.println("微服务Eureka 7002 端口已启动...");
		
	}
	
}
