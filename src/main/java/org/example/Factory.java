package org.example;
import java.util.ArrayList;
import java.util.Random;

import java.util.ArrayList;

public class Factory
{

    public ArrayList<Boolean> produceRandomBits()
    {
        ArrayList<Boolean> bits = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= 8; i++)
        {
            bits.add(random.nextInt(0, 2) == 1);
        }
        return bits;
    }

    public void generateBitLists(int numberOfLists)
    {
        if (numberOfLists <= 0) {
            return;
        }
        produceRandomBits();
        generateBitLists(numberOfLists - 1);
    }

    public byte produceByte(ArrayList<Boolean> bits)
    {
        byte byteVal = 0;
        for (int i = bits.size() - 1; i >= 0; i--)
        {
            if (bits.get(i))
            {
                byteVal += Math.pow(2, i);
            }
        }
        return byteVal;
    }

    public void makeChars(int byteValue)
    {
        char character = (char) byteValue;
        if (isLetterValid(byteValue))
        {
            System.out.println("Character: " + character);
        } else {
            System.out.println("Invalid char.");
        }
    }

    public boolean isLetterValid(int byteValue)
    {
        return byteValue >= 97 && byteValue <= 122;
    }
}

