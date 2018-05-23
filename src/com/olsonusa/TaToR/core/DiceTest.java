package com.olsonusa.TaToR.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest
{

    @Test
    void rollTestInBounds()
    {
        Dice testDice = new Dice(10);
        for (int i = 0; i < 1000; i++)
        {
            int result = testDice.Roll();
            assertTrue(result <= 10 && result > 0);

        }
    }
    @Test
    void rollTestDistribution()
    {
        Dice testDice = new Dice(20);
        int[] occurenceCounter = new int[20];
        for (int i = 0; i < 10000000; i++)
        {
            int result = testDice.Roll();
            occurenceCounter[result-1]++;
        }

        for (int i = 0; i < 20; i++)
        {
            int rollNumber = i+1;
            System.out.println("Roll[" + rollNumber + "]=" + occurenceCounter[i]);
            assertTrue(occurenceCounter[i] > 0);
        }
    }

}