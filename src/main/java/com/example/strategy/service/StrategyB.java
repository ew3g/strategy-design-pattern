package com.example.strategy.service;

import com.example.strategy.controller.StrategyEntity;
import com.example.strategy.service.enums.StrategyName;
import org.springframework.stereotype.Component;

@Component
public class StrategyB implements Strategy {
    @Override
    public void doStuff(StrategyEntity strategyEntity) {
        System.out.println(String.format("I am algorithm B. The model is: %s", strategyEntity));
    }

    @Override
    public StrategyName getStrategyName() {
        return StrategyName.StrategyB;
    }
}
