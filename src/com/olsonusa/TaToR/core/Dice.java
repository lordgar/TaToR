package com.olsonusa.TaToR.core;

import java.util.Random;

public class Dice
{
    private Random rng;
    private int diceSides;

    public Dice(int sides)
    {
        rng = new Random();
        diceSides = sides;
    }

    public int Roll()
    {
        int roll = rng.nextInt(diceSides);
        return roll + 1;
    }
}
