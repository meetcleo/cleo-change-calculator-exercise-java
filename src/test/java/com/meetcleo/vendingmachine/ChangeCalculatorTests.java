package com.meetcleo.vendingmachine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ChangeCalculatorTests {
    @Test
    void canBeInstantiated() {
        final ChangeCalculator changeCalculator = new ChangeCalculator();
        System.out.println(changeCalculator);
    }
}
