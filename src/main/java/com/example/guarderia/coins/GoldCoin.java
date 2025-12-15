package com.example.guarderia.coins;

import com.example.guarderia.interfaces.CoinInterface;

public class GoldCoin implements CoinInterface {

    private final String coinType = "Gold";

    @Override
    public String getDescription() {
        return "This is coin of type: " + coinType;
    }
}
