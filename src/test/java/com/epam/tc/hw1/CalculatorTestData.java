package com.epam.tc.hw1;

import org.testng.annotations.DataProvider;

public class CalculatorTestData {

    @DataProvider
    public static Object[][] getTestDataForSum() {
        return new Object[][]{
                {1, 4, 5},
                {3, 5, 8},
                {-10, 3, -7}
        };
    }

    @DataProvider
    public static Object[][] getTestDataForSumOverflow() {
        return new Object[][]{
                {Integer.MAX_VALUE, 1}
        };
    }

    @DataProvider
    public static Object[][] getTestDataForSub() {
        return new Object[][]{
                {1, 4, -3},
                {205, 5, 200},
                {-10, 3, -13}
        };
    }

    @DataProvider
    public static Object[][] getTestDataForSubOverflow() {
        return new Object[][]{
                {Integer.MAX_VALUE, -2},
                {Integer.MIN_VALUE, 1}
        };
    }

    @DataProvider
    public static Object[][] getTestDataForMultiply() {
        return new Object[][]{
                {1, 4, 4},
                {10, 5, 50},
                {-4, 3, -12}
        };
    }

    @DataProvider
    public static Object[][] getTestDataForMultiplyOverflow() {
        return new Object[][]{
                {-2, Integer.MIN_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MIN_VALUE, Integer.MIN_VALUE}
        };
    }

    @DataProvider
    public static Object[][] getTestDataForDivide() {
        return new Object[][]{
                {7, 3, 2.3333333333333335},
                {205, 5, 41},
                {-3, 1, -3}
        };
    }

    @DataProvider
    public static Object[][] getTestDataForDivideByZero() {
        return new Object[][]{
                {-3, 0}
        };
    }
}