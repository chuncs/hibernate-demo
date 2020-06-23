package com.synergistic.hibernatedemo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionalService {

    public List<String> list = new ArrayList<>();

    //https://codete.com/blog/5-common-spring-transactional-pitfalls/
    @Transactional
    public void submit() {
        list.add("a");
        list.add("b");
        list.add("c");

        throw new RuntimeException("Testing exception");
    }

    public List<String> get() {
        return list;
    }
}
