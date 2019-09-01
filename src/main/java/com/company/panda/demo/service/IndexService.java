package com.company.panda.demo.service;

import org.springframework.stereotype.Service;

@Service
public class IndexService {

    public String test(String test) {
        System.out.println(1/0);
        return test;
    }
}
