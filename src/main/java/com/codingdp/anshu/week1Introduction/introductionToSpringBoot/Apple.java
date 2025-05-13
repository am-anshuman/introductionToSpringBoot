package com.codingdp.anshu.week1Introduction.introductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Apple {

    void eatApple() {
        System.out.println("I'm eating an Apple");
    }

    @PostConstruct
    void callThisBeforeAppleIsUsed() {
        System.out.println("Creating Apple before use");
    }

    @PreDestroy
    void callThisBeforeDestroying() {
        System.out.println("Destroying the Apple bean");
    }

}
