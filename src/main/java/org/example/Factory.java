package org.example;
import java.util.ArrayList;
import java.util.Random;

import java.util.ArrayList;

public class Factory
{
    public boolean produceRandomBits() {
        Random random = new Random();
        return random.nextInt(0, 2) == 1;
    public boolean produceRandomBit()
    {
    }

    public byte produceByte(ArrayList<Boolean> bits)
    {
        byte byteVal = 0;
        for (int i = bits.size()-1 ;i >=0; i--)
        {
            if(bits.get(i))
            {
                byteVal += Math.pow(2.0, i);
            }
        }
        return byteVal;
    }
}
