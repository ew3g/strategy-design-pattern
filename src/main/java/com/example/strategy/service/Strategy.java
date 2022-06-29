package com.example.strategy.service;

import com.example.strategy.controller.StrategyEntity;
import com.example.strategy.service.enums.StrategyName;

public interface Strategy {

    void doStuff(StrategyEntity strategyEntity);

    StrategyName getStrategyName();
}
