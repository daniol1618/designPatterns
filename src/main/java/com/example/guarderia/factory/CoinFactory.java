package com.example.guarderia.factory;

import com.example.guarderia.enums.CoinType;
import com.example.guarderia.interfaces.CoinInterface;

public class CoinFactory {

    public static CoinInterface getCoin(CoinType type) {
        return type.getConstructor().get();
    }
}