package main.Domain;

import java.util.Random;

public class RandomNumber {
    private int number;
    public void generateNumber(){
        this.number= (int)(Math.random()*10);
    }
}
