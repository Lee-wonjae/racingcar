package main.Domain;

public class CarGame {//차 하나의 움직임(게임)
    private int gameNum;
    private Car car;

    public CarGame(Car car,int gameNum){
        this.car=car;
        this.gameNum=gameNum;
    }
    public Car CarGameStart(Car car,int gameNum) {
        this.gameNum = gameNum;
        for(int i=0; i<gameNum;i++) {
            RandomNumber.generateNumber();
            if (RandomNumber.number > 4) {
                car.moveforeword();
            } else {
                car.movestop();
            }
        }
        return car;
    }
}
