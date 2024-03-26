# Cleo Change Calculator Exercise (Java, Grad Hiring Edition)

This is an implementation of a change calculator such as you might find in
a vending machine.  Given an amount of money, it will tell you all the coins you need to make that amount using the standard UK denominations of coins (£2, £1, 50p, 20p, 10p, 5p, 2p, 1p).  For example, to make change of £2.12 you need one each of the £2, 10p, and 2p coins whereas to make £1.44 you need one £1 and two each of the 20p and 2p coins.  We will minimise the coins used to make the change, so while you can make £1.53 with three 50p coins and three 1p coins the result we want is one each of the £1, 50p, 2p and 1p coins because it uses less coins.

## Setup

Clone the repo and checkout the branch:

```shell
git clone https://github.com/meetcleo/cleo-change-calculator-exercise-java.git
cd cleo-change-calculator-exercise-java
git checkout grad-hiring
```

Then execute:

```
./gradlew test
```

To run the tests.  Should work with most newish javas as we've not specified an explicit one.

## Usage

There's a simple class `ChangeCalculator` in `src/main/java/com/meetcleo/vendingmachine/ChangeCalculator.java`, that implements the change calculation behaviour we need.

It is supported by tests written in JUnit in `src/test/java/com/meetcleo/vendingmachine/ChangeCalculatorTests.java` which you can run these via:

```shell
./gradlew test
```

Note: all coins and amounts are expressed in pence using whole integers - this calculator would be plugged into a system that does conversion to £x.yyp notation in a UI.
