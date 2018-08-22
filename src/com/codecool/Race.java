package com.codecool;
import java.util.List;
import java.util.ArrayList;

public class Race {
    public List<Car> cars = new ArrayList<Car>();
    public List<Motorcycle> motors = new ArrayList<Motorcycle>();
    public List<Truck> trucks = new ArrayList<Truck>();
    int raceParticipants = 10;
    int rounds = 50;

    private void createVehicles() {
        for (int i =0; i<raceParticipants; i++){
            cars.add(new Car());
            Motorcycle motorcycle = new Motorcycle();
            motorcycle.name = "Motorcycle " + Integer.toString(i+1);
            motors.add(motorcycle);
            trucks.add(new Truck());
        }
    }

    private void simulateRace(int rounds){
        int brakedownCounter = 0;
        for (int j =0; j<rounds; j++){
            for (int i =0; i<raceParticipants; i++) {
                cars.get(i).moveForAnHour();
                motors.get(i).moveForAnHour();
                trucks.get(i).moveForAnHour();
                if (trucks.get(i).breakdownTurnsLeft > 0){
                    brakedownCounter += 1;
                }
            }
            if (brakedownCounter>0){
                isThereABrokenTruck = true;
            } else {
                isThereABrokenTruck = false;
            }
            Weather.setRaining();
            brakedownCounter = 0;
        }
    }

    private void printRaceResults(){
        for (int i =0; i<raceParticipants; i++){
            System.out.println(cars.get(i).name + ", a " + cars.get(i).type + " has made " + Integer.toString(cars.get(i).distanceTraveled) + "km's");
            System.out.println(motors.get(i).name + ", a " + motors.get(i).type + " has made " + Integer.toString(motors.get(i).distanceTraveled) + "km's");
            System.out.println(trucks.get(i).name + ", a " + trucks.get(i).type + " has made " + Integer.toString(trucks.get(i).distanceTraveled) + "km's");
        }
    }

    public static boolean isThereABrokenTruck = false;

    public static void main(String[] args) {
        Race game = new Race();
        game.createVehicles();
        game.simulateRace(game.rounds);
        game.printRaceResults();
    }
}

