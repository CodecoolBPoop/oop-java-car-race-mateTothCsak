package com.codecool;
import java.util.Random;

public class Truck extends Vehicle {
    Random rand = new Random();
    int normalSpeed = 100;
    int name = rand.nextInt(1000) + 1;
    int distanceTraveled;
    int breakdownTurnsLeft = 0;
    int breakdownNumber;
    String type = "truck";

    public void moveForAnHour(){
        if (breakdownTurnsLeft == 0) {
            breakdownNumber = rand.nextInt(20);
            if (breakdownNumber == 0) {
                breakdownTurnsLeft = 2;
            } else {
                distanceTraveled += normalSpeed;
            }
        } else {
            breakdownTurnsLeft -= 1;
        }
    }
}
