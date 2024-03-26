package com.meetcleo.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class ChangeCalculator {
    List<Integer> coinsNeeded(Integer amount) {
        if (amount == 0) {
            return List.of();
        }

        List<Integer> requiredCoins = new ArrayList<>();
        for (Integer availableCoin : availableCoins()) {
            if (amount >= availableCoin) {
                requiredCoins.add(availableCoin);
                amount -= availableCoin;
            }
        }

        return requiredCoins;
    }

    private List<Integer> availableCoins() {
        return DENOMINATIONS;
    }

    private static final List<Integer> DENOMINATIONS = List.of(
            50,
            5,
            200,
            20,
            2,
            100,
            10,
            1
    );
}