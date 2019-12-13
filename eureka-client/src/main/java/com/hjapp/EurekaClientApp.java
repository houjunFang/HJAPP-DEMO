package com.hjapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaClientApp.class,args);
    }

    @RequestMapping("/hi")
    public String sayHi(){
        return "hello,Eureka!!!";
    }


}
