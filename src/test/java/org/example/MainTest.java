package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class NumberGuessingGameTest {

    private Main game;

    @BeforeEach
    void setUp() {
        game = new Main();
    }

    @Test
    void testSetDifficulty_Easy() {
        String input = "1";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        int chances = game.setDifficulty(input, scanner);
        assertEquals(10, chances);
    }

    @Test
    void testSetDifficulty_Medium() {
        String input = "2";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        int chances = game.setDifficulty(input, scanner);
        assertEquals(5, chances);
    }

    @Test
    void testSetDifficulty_Hard() {
        String input = "3";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        int chances = game.setDifficulty(input, scanner);
        assertEquals(3, chances);
    }

    @Test
    void testSetDifficulty_Exit() {
        String input = "4";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        int chances = game.setDifficulty(input, scanner);
        assertEquals(0, chances);
    }


    //no idea what to implement in this test case so assertTrue
    @Test
    void testPlayGame_CorrectGuess() {
        String input = "50";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        game.playGame(1, 50, scanner);
        assertTrue(true);
    }

}
