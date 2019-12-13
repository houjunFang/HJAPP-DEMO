package com.hjapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaServerApp.class,args);
    }


    @EnableWebSecurity
    static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
//            http.csrf().disable()
//                    .authorizeRequests()
//                    .anyRequest()
//                    .authenticated()
//                    .and()
//                    .httpBasic();
            http.csrf().disable();
            super.configure(http);
        }
    }
}
