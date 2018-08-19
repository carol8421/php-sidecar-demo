package io.xxweimei.java.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JavaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaApiApplication.class, args);
    }
}
