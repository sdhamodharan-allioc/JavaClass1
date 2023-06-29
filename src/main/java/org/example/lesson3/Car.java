package org.example.lesson3;

public class Car {
    private String model;
    private double price;
    private int numberOfSeats;

    //private Address beginningAddress;

    public Car(){
        System.out.println("No args constructor");
    }

    public Car(String aModel, double aPrice, int aNumberOfSeats){
        model = aModel;
        price = aPrice;
        numberOfSeats = aNumberOfSeats;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setNumberOfSeats(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
    }

    public void move(){
        //moveForward(250);
        //moveReverse(10);
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }

    public static void main(String[] args) {
        Car hondaCRV = new Car();
        hondaCRV.setModel("HondaCRV");
        hondaCRV.setPrice(38500);
        hondaCRV.setNumberOfSeats(4);
        System.out.println(hondaCRV);

        Car hondaOdyssey = new Car("Odyssey", 55000, 7);
        System.out.println(hondaOdyssey);


    }
}
