package com.synergistic.hibernatedemo.controller;

import com.synergistic.hibernatedemo.service.TransactionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionalController {

    @Autowired
    private TransactionalService service;

    @GetMapping("/get")
    public ResponseEntity<List<String>> callGet() {
        return ResponseEntity.ok(service.list);
    }

    @GetMapping("/submit")
    public void callSubmit() {
        service.submit();
    }
}
