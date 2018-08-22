package com.codecool;
import java.util.Random;

public class Motorcycle extends Vehicle {
    Random rand = new Random();
    int normalSpeed = 100;
    int actualSpeed;
    int distanceTraveled;
    String type = "motorcycle";

    private void setSpeed() {
        if (Weather.isRaining){
            actualSpeed = normalSpeed - rand.nextInt(46) + 5;
        } else {
            actualSpeed = normalSpeed;
        }
    }

    public void moveForAnHour() {
        setSpeed();
        distanceTraveled += actualSpeed;
    }


}
