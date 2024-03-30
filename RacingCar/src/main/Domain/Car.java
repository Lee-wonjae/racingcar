package main.Domain;

public class Car {
    private final String name;
    private int point;
    public Car(String name) {
        this.name = name;
        this.point = 0;
    }
    public void moveforeword(){
        point ++;
    }
    public void movestop(){
        point --;
    }
}
