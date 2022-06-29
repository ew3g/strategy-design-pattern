package com.example.strategy.service;

import com.example.strategy.controller.StrategyEntity;
import com.example.strategy.service.enums.StrategyName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private StrategyFactory strategyFactory;

    public void doSomething(StrategyEntity strategyEntity) {
        Strategy strategy = strategyFactory.findStrategy(strategyEntity.getStrategyName());
        strategy.doStuff(strategyEntity);
    }


    @Autowired
    public void setStrategyFactory(StrategyFactory strategyFactory) {
        this.strategyFactory = strategyFactory;
    }
}
