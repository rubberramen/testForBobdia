package io.cloudtype.waitlist.controller;

import io.cloudtype.waitlist.model.Test;
import io.cloudtype.waitlist.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @GetMapping
    public String test01() {
        return "hello world";
    }

    @GetMapping("/findAll")
    public List<Test> getAll() {
        return testRepository.findAll();
    }
}
