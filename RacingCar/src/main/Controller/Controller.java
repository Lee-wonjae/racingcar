package main.Controller;

import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import main.Domain.Car;
import main.Domain.*;
import main.View.*;


public class Controller {

    private final InputValidator inputValidator;
    private final InputParser inputParser;
    private final Scanner scanner;
    private final Input input;
    private final Output output;

    public Controller(InputValidator inputValidator, InputParser inputParser, Scanner scanner, final Input input, final Output output) {
        this.inputValidator = inputValidator;
        this.inputParser = inputParser;
        this.scanner = scanner;
        this.input = input;
        this.output = output;
    }


}