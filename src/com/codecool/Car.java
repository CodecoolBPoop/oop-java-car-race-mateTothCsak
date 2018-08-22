package com.codecool;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Car extends Vehicle {
    String[] carNames = new String[]{"Crown", "Magic", "Umbra", "Tigress", "Intro", "Paradox", "Escape", "Serpent", "Vulture", "Rune"};
    Random rand = new Random();
    int firstName = rand.nextInt(10);
    int lastName = rand.nextInt(10);
    int normalSpeed = rand.nextInt(31) + 80; // ((max - min) + 1) + min
    int actualSpeed;
    int distanceTraveled;
    public String name = carNames[firstName] + " " + carNames[lastName];
    String type = "car";

    private void setSpeed() {
        if (Race.isThereABrokenTruck){
            actualSpeed = 75;
        } else {
            actualSpeed = normalSpeed;
        }
    }

    public void moveForAnHour() {
        setSpeed();
        distanceTraveled += actualSpeed;
    }

}
