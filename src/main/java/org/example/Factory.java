package org.example;
import java.util.ArrayList;
import java.util.Random;

public class Factory
{
    public void produceRandomBit(){
        Random random = new Random();
        ArrayList<Boolean> bits = new ArrayList<>();


        for (int i = 0; i <= 8; i++){
            int randomNumber = random.nextInt(0,2);
            boolean numberBit = true;

            if (randomNumber == 1){
                bits.add(numberBit);
            } else {
                numberBit = false;
                bits.add(numberBit);
            }
        }
        System.out.println(bits);
    }
}
