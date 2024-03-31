package main.Domain;

import java.util.List;

public class CarsGame {
    public List<Car> cars;
    private int gameNum;
    public CarsGame(List<String> nameList){
        for (int i = 0; i < nameList.toArray().length; i++) {
            cars.set(i,new Car(nameList.get(i)));
        }
    }
    public void GameStart( int gameNum) {
        for (int i = 0; i < cars.toArray().length; i++) {
            cars = (List<Car>) new CarGame(cars.get(i), gameNum);
        }
    }
}
