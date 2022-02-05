package Homeworks.HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Jetty {
    private ArrayList<Integer> avgPassengerTime;
    private ArrayList<Integer> avgBoatTime;
    private ArrayList<Integer> avgTimePassengerAtStop;
    private int numSeats;
    private boolean stopType;

    public Jetty() {
        avgPassengerTime = new ArrayList<Integer>();
        avgBoatTime = new ArrayList<Integer>();
    }

    public void fillData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input average time between passenger arrivals at day: ");
        avgPassengerTime.add(Integer.valueOf(reader.readLine()));
        System.out.println("Input average time between passenger arrivals at night: ");
        avgPassengerTime.add(Integer.valueOf(reader.readLine()));
        avgPassengerTime.forEach(System.out::println);


        System.out.println("Input average time between boat arrivals at day: ");
        avgBoatTime.add(Integer.valueOf(reader.readLine()));
        System.out.println("Input average time between boat arrivals at night: ");
        avgBoatTime.add(Integer.valueOf(reader.readLine()));
        avgBoatTime.forEach(System.out::println);

        System.out.println("Input '+' if it's final stop or '-' if it's not: ");
        stopType = reader.readLine() == "+";

        Random rand = new Random();
        numSeats = rand.nextInt(20);
    }

    public void countTimePassengerAtStop() {
        avgTimePassengerAtStop.add(numSeats * avgPassengerTime.get(0) / avgBoatTime.get(0));
        avgTimePassengerAtStop.add(numSeats * avgPassengerTime.get(1) / avgBoatTime.get(1));
    }

}
