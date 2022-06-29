package com.example.strategy.controller;


import com.example.strategy.service.enums.StrategyName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class StrategyEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -6587097496785541924L;

    private String value;

    private StrategyName strategyName;
}
