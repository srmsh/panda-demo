package com.company.panda.demo.web;

import com.company.panda.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Index {

    private final IndexService indexService;

    public Index(IndexService indexService) {
        this.indexService = indexService;
    }

    @GetMapping("index/{test}")
    public String test(@PathVariable String test) {

        return "ok--------" + indexService.test(test);
    }
}
