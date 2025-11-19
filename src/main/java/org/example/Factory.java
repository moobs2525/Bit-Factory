package org.example;
import java.util.Random;

public class Factory
{
    public boolean produceRandomBit(){
        Random random = new Random();

        int random2 = random.nextInt(0,2);

        System.out.println(random2);


        return true;
    }
}
