package leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;


public class BestTimeToBuyAndSellStock {
    // You are given an array prices where prices[i] is the price of a given stock on the ith day.
    //
    //You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    //
    //Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

    static Stream<int[]> provideTestArrays() {
        return Stream.of(
                new int[] { 7, 1, 5, 3, 6, 4 },
                new int[] { 2, 4, 1, 7, 5 }
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestArrays")
    public void maxProfit(int[] prices) {
        System.out.println(Arrays.toString(prices));

    }

}
