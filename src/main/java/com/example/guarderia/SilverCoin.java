package com.example.guarderia;

import com.example.guarderia.interfaces.CoinInterface;

public class SilverCoin implements CoinInterface {

    private final String coinType = "Silver";

    @Override
    public String getDescription() {
        return "This is coin of type: " + coinType;
    }
}
