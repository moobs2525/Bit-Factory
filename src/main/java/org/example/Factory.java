package org.example;
import java.util.ArrayList;
import java.util.Random;

public class Factory
{
    public boolean produceRandomBits() {
        Random random = new Random();
        return random.nextInt(0, 2) == 1;
    }
}
