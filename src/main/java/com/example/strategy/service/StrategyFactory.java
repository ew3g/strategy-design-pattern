package com.example.strategy.service;

import com.example.strategy.service.enums.StrategyName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class StrategyFactory {

    private Map<StrategyName, Strategy> strategyMap;

    @Autowired
    public StrategyFactory(Set<Strategy> strategySet) {
        createStrategy(strategySet);
    }

    public Strategy findStrategy(StrategyName strategyName) {
        return strategyMap.get(strategyName);
    }

    private void createStrategy(Set<Strategy> strategySet) {
        strategyMap = new HashMap<>();
        strategySet.forEach(strategy -> strategyMap.put(strategy.getStrategyName(), strategy));
    }
}
