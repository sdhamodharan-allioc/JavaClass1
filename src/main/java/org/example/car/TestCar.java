package org.example.car;

public class TestCar {
    public static void main(String[] args) {
        Car dhamoCRV = new Car("Honda-CRV");
        Car elangoOdessey = new Car("Honda-Odessey");

        //dhamoCRV.move();
        // dhamoCRV
        //elangoOdessey.move();
/*
        fireCrackers();
        goAroundTheCity(dhamoCRV);
        fireCrackers();
        goAroundTheCity(elangoOdessey);
        fireCrackers();


 */
    }

    /**
     * @apiNote Go Around the City and see firing crackers.
     * @author Dhamo
     * @param anyCar - Car object that goes around.
     * @return numberOfRounds
     */
    public static Integer goAroundTheCity(Car anyCar){
        System.out.println("Go Around the City");
           anyCar.move();
        System.out.println("Finished going  Around the City");
        return 20;
    }

    public static void fireCrackers(){
        System.out.println("Fire Crackers....");
    }
}
