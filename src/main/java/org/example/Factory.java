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

    public int produceByte(ArrayList<Boolean> bitList)
    {
        int byteValue = 0;
        int bitListSize = bitList.size() - 1; //-1 for indexing
        for (int i = bitListSize; i >= 0; i--) {
            if (bitList.get(i)) {
                byteValue += Math.pow(2, bitListSize - i);
            }
        }
        System.out.println("Byte value: " + byteValue);
        return byteValue;
    }

    public void makeChars(int byteValue)
    {
        char character = (char) byteValue;
        System.out.println("Character: " + character);
    }
}

