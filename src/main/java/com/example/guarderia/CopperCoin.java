package com.example.guarderia;

import com.example.guarderia.interfaces.CoinInterface;

public class CopperCoin implements CoinInterface {

    private final String coinType = "Copper";

    @Override
    public String getDescription() {
        return "This is coin of type: " + coinType;
    }
}
