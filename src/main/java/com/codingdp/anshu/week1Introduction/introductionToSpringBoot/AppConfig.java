package com.codingdp.anshu.week1Introduction.introductionToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    // @Scope('prototype') // creates multiple instances of the class
    @Scope("singleton") // or we can totally avoid this annotation, which is still going to work as 'singleton'.
    Apple getApple() {
        return new Apple();
    }

}
