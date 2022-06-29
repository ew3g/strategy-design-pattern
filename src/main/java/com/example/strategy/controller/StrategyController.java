package com.example.strategy.controller;

import com.example.strategy.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/strategy")
public class StrategyController {

    private MyService myService;

    @PostMapping
    public ResponseEntity<String> processStrategy(@RequestBody StrategyEntity strategyEntity) {
        myService.doSomething(strategyEntity);
        return ResponseEntity.ok("ok");
    }

    @Autowired
    public void setMyService(MyService myService) {
        this.myService = myService;
    }
}
