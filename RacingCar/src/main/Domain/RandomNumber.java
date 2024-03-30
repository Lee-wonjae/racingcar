package main.Domain;

import java.util.Random;

public class RandomNumber {
    static int number;
    public static void generateNumber(){
        number= (int)(Math.random()*10);
    }
}
