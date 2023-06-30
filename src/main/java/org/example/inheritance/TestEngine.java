package org.example.inheritance;

public class TestEngine {
    public static void main(String[] args) {
        //Engine engine = new Engine();
        PetrolEngine petrolEngine = new PetrolEngine("Honda", "CRV",1000, "88C");
        petrolEngine.move(10);
        petrolEngine.move(20);
        petrolEngine.getMileage();

        FlightEngine flightEngine = new FlightEngine("Boeing", "767", 100000);
        flightEngine.move(50000);
        flightEngine.getMileage();

    }
}
