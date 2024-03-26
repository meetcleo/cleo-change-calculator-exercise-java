package com.meetcleo.vendingmachine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.Map;

public class ChangeCalculatorTests {
    final static ChangeCalculator changeCalculator = new ChangeCalculator();

    @Test
    void returnsEmptyListWhenAmountIsZero() {
        final List<Integer> expected = List.of();
        final List<Integer> actual = changeCalculator.coinsNeeded(0);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, 10, 20, 50, 100, 200})
    void returnExactlyOneCoinOfCorrectDenominationIfThatIsTheAmountRequested(Integer denomination) {
        final List<Integer> expected = List.of(denomination);
        final List<Integer> actual = changeCalculator.coinsNeeded(denomination);

        assertEquals(expected, actual);
    }

    @Test
    void combinesMultipleCoinsToBuildTheRequestedAmount() {
        Map<Integer, List<Integer>> expectedOutputsForInputs = Map.of(
                163, List.of(100, 50, 10, 2, 1),
                37, List.of(20, 10, 5, 2),
                15, List.of(10, 5),
                202, List.of(200, 2)
        );

        expectedOutputsForInputs.forEach(
                (input, expectedOutput) -> assertEquals(expectedOutput, changeCalculator.coinsNeeded(input))
        );
    }
}
