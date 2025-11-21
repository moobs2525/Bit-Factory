package org.example;
import java.util.ArrayList;
import java.util.Random;

import java.util.ArrayList;

public class Factory
{

    private int counterGood;
    private int counterBad;
    private StringBuilder sb = new StringBuilder();

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
        makeChars(produceByte(produceRandomBits()));
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

        if (isLetterValid(byteValue))
        {
            counterGood++;
            char goodChar = (char)byteValue;
            sb.append((goodChar));
        } else {
            counterBad++;
        }
    }

    public void displayCounters()
    {
        System.out.println("Good characters: " + counterGood);
        System.out.println("Invalid characters: " + counterBad);
    }

    public boolean isLetterValid(int byteValue)
    {
        return byteValue >= 97 && byteValue <= 122;
    }

    public void charCombiner()
    {

        System.out.println(sb.toString());

    }
}

