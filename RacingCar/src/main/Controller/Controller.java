package main.Controller;

import java.util.List;
import java.util.function.Supplier;
import main.Domain.Car;
import main.Domain.*;
import main.View.*;


public class Controller {

    private final Input input;
    private final Output output;

    public Controller(final Input input, final Output output) {
        this.input = input;
        this.output = output;
    }

    public <T> T retry(final Supplier<T> supplier) {
        try {
            return supplier.get();
        } catch (IllegalArgumentException e) {
            output.printErrorMessage(e.getMessage());
            return retry(supplier);
        }
    }

    public void run() {
        CarsGame Game =new CarsGame(input.readCarNames(),input.readCount());
        play(racingGame);
        findWinners(racingGame);
    }

    private CarsGame initialize() {
        List<String> carNames = retry(inputView::readCarNames);
        int count = retry(inputView::readCount);
        return new RacingGame(new RandomNumberGenerator(), carNames, count);
    }

    private void play(final RacingGame racingGame) {
        outputView.printResultMessage();
        while (racingGame.isPlayable()) {
            racingGame.play();
            List<Car> cars = racingGame.findCurrentCarPositions();
            outputView.printCurrentCarPositions(cars);
        }
    }

    private void findWinners(final RacingGame racingGame) {
        List<String> winners = racingGame.findWinners();
        outputView.printWinnersMessage(winners);
    }
}