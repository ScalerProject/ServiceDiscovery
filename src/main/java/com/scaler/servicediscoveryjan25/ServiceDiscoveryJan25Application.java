package com.scaler.servicediscoveryjan25;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryJan25Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryJan25Application.class, args);
    }

}
