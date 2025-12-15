package com.example.guarderia;

import com.example.guarderia.interfaces.CoinInterface;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@RequiredArgsConstructor
@Getter
public enum CoinType {

    SILVER(SilverCoin::new),
    COPPER(CopperCoin::new),
    GOLD(GoldCoin::new);

    private final Supplier<CoinInterface> constructor;
}
