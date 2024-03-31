package main.View;

import java.util.List;
import java.util.Scanner;

public class Input {

    private static final String READ_NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String READ_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";

    private final main.View.InputValidator inputValidator;
    private final main.View.InputParser inputParser;
    private final Scanner scanner;

    public Input(final main.View.InputValidator inputValidator, final main.View.InputParser inputParser, final Scanner scanner) {
        this.inputValidator = inputValidator;
        this.inputParser = inputParser;
        this.scanner = scanner;
    }

    public List<String> readCarNames() {
        System.out.println(READ_NAMES_MESSAGE);
        List<String> names = inputParser.splitAndParseNames(scanner.nextLine());

        inputValidator.validateNames(names);

        return names;
    }

    public int readCount() {
        System.out.println(READ_COUNT_MESSAGE);
        int count = inputParser.parseInt(scanner.nextLine());

        inputValidator.validateCount(count);

        return count;
    }
}