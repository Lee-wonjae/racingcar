package main.Domain;

public class Game {
    private int gameNum;
    private Car car;
    public Game(int gameNum) {
        this.gameNum = gameNum;
    }
    
    for (int i=0;i<gameNum ;i++){
        RandomNumber.generateNumber();
        if (RandomNumber.number>4 ){
            car.moveforeword();
        }else{
            car.movestop();
        }
    }
}
