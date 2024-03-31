package main;

import main.Controller.Controller;
import main.View.Input;
import main.View.InputParser;
import main.View.InputValidator;
import main.View.Output;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Controller controller=new Controller(input(),output());
        Controller.run();
    }
    private static Input input() {
        return new Input(inputValidator(), inputParser(), scanner);
    }

    private static InputValidator inputValidator() {
        return new InputValidator();
    }

    private static InputParser inputParser() {
        return new InputParser();
    }

    private static Output output() {
        return new Output();
    }
}