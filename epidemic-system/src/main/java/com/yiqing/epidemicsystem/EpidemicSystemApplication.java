package com.yiqing.epidemicsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.yiqing"})
public class EpidemicSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EpidemicSystemApplication.class, args);
    }

}
