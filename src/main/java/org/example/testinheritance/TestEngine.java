package org.example.testinheritance;

import org.example.inheritance.DieselEngine;
import org.example.inheritance.PetrolEngine;

public class TestEngine {
    public static void main(String[] args) {
        PetrolEngine petrolEngine = new PetrolEngine("Honda", "CRV", 1500, "88G");
        DieselEngine dieselEngine = new DieselEngine("Truck", "SuperPower", 3000, "DG007");
        petrolEngine.move(20);
        dieselEngine.move(100);
        petrolEngine.move(50);
        petrolEngine.getMileage();
        System.out.println(petrolEngine);
        System.out.println(dieselEngine);

    }
}
