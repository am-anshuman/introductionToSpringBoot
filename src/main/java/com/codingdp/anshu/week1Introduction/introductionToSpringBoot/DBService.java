package com.codingdp.anshu.week1Introduction.introductionToSpringBoot;

import org.springframework.stereotype.Service;

@Service
public class DBService {

    private final DB db;

    public DBService(DB db) {
        this.db = db;
    }

    String getData() {
        return db.getData();
    }

}
