package com.lt.lott;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//-Dspring.profiles.active=uat
@SpringBootApplication
public class LottApplication {

    public static void main(String[] args) {
        SpringApplication.run(LottApplication.class, args);
    }

}
