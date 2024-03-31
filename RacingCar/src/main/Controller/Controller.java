package main.Controller;

import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import main.Domain.Car;
import main.Domain.*;
import main.View.*;


public class Controller {
    private final Input input;
    private final Output output;


    public Controller(Input input, Output output) {
        this.input = input;
        this.output = output;
    }
}