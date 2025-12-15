package com.example.guarderia;

import com.example.guarderia.interfaces.CoinInterface;

public class CoinFactory {

    public static CoinInterface getCoin(CoinType type) {
        return type.getConstructor().get();
    }
}