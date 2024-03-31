package main.Domain;

import java.util.List;

public class CarsGame {
    private List<Car> cars;
    private int gameNum;
    public CarsGame(List<Car> cars, int gameNum) {
        this.cars = cars;
        this.gameNum = gameNum;
    }
    private List<Car> GameStart(List<Car> cars, int gameNum) {
        List<Car> newcars = null;
        for (int i = 0; i < cars.toArray().length; i++) {
            newcars = (List<Car>) new CarGame(cars.get(i), gameNum);
        }
        return newcars;
    }
}
