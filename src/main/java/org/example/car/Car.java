package org.example.car;

import org.example.car.mechanic.Tyre;

import java.util.ArrayList; // class
import java.util.List; // interface

public class Car {

    //Constants
    public static final int MODEL_NUMBER = 100;
    private String name;
    private Tyre frontLeft; // MRF
    private Tyre frontRight; //MRF
    private Tyre rearLeft; //MRF
    private Tyre rearRight; //MRF
    private List<Tyre> tyreList;

    private Engine engine;

    /**
     *
     * */
    public Car(String name){
        this.name = name;
        frontLeft = new Tyre();
        engine = new Engine();
        tyreList = new ArrayList<>();
        // MODEL_NUMBER = 200;

    }

    public  void move(){
        System.out.println("drive the car 10 miles : "+name);
        System.out.println("Rotate Front tyre"+frontLeft);
    }

    public void replaceTyre(Tyre everyTyre){
        // frontLeft = // Good Year
    }

//     010101 - binary  4 * 5  ==> (100 * 101 )
 //    Machine Language - Registers - hold memory .
    // Main, Hard
public static void main(String[] args) {
    Car newCar = new Car("Honda");
    newCar.replaceTyre(newCar.rearLeft);
    newCar.replaceTyre(newCar.rearRight);
}

}


