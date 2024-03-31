package main.Domain;

public class Car {
    public String getName() {
        return name;
    }

    private final String name;

    public int getPoint() {
        return point;
    }

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
