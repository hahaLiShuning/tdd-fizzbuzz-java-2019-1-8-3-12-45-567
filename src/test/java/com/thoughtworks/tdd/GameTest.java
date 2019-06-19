package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    private Game game;

    @BeforeAll
    public void setUp() {
        game = new Game();
    }

    @Test
    public void should_return_Fizz_when_it_is_only_the_multiple_of_3() {
        int [] testNums = { 3, 6 };
        String expected = "Fizz";
        run_when_it_is_only_one_type_of_special_number(testNums, expected);
    }

    @Test
    public void should_return_Buzz_when_it_is_only_the_multiple_of_5() {
        int [] testNums = { 5, 10 };
        String expected = "Buzz";
        run_when_it_is_only_one_type_of_special_number(testNums, expected);
    }

    @Test
    public void should_return_Whizz_when_it_is_only_the_multiple_of_7() {
        int [] testNums = { 7, 14 };
        String expected = "Whizz";
        run_when_it_is_only_one_type_of_special_number(testNums, expected);
    }

    @Test
    public void should_return_FizzBuzz_when_it_is_the_multiple_of_3_and_5() {
        int [] testNums = {15, 30};
        String expected = "FizzBuzz";
        run_when_it_is_two_type_of_speciall_number(testNums, expected);
    }

    @Test
    public void should_return_FizzWhizz_when_it_is_the_multiple_of_3_and_7() {
        int [] testNums = {21, 42};
        String expected = "FizzWhizz";
        run_when_it_is_two_type_of_speciall_number(testNums, expected);
    }

    @Test
    public void should_return_FizzWhizz_when_it_is_the_multiple_of_5_and_7() {
        int [] testNums = {35, 70};
        String expected = "BuzzWhizz";
        run_when_it_is_two_type_of_speciall_number(testNums, expected);
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_it_is_the_multiple_of_3_5_and_7() {
        int [] testNums = {105, 210};
        String expected = "FizzBuzzWhizz";
        String result1 = game.generateResult(testNums[0]);
        String result2 = game.generateResult(testNums[1]);

        assertEquals(result1, expected);
        assertEquals(result2, expected);
    }

    private void run_when_it_is_only_one_type_of_special_number(int[] testNums, String expected) {
        String result1 = game.generateResult(testNums[0]);
        String result2 = game.generateResult(testNums[1]);

        assertEquals(result1, expected);
        assertEquals(result2, expected);
    }

    private void run_when_it_is_two_type_of_speciall_number(int [] testNums, String expected) {
        String result1 = game.generateResult(testNums[0]);
        String result2 = game.generateResult(testNums[1]);

        assertEquals(result1, expected);
        assertEquals(result2, expected);
    }
}
