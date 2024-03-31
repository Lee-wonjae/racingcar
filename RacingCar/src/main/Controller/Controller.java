package main.Controller;

import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import main.Domain.Car;
import main.Domain.*;
import main.View.*;


public class Controller {
    private static Input input = null;
    private final Output output;


    public Controller(Input input, Output output) {
        this.input = input;
        this.output = output;
    }

    public static void run() {
        CarsGame carsgame = new CarsGame(input.readCarNames());
        carsgame.GameStart(input.readCount());
        System.out.println(carsgame.cars);
    }

}