package org.example.dynamicbinding;

public class TestDynamicBinding {
    public static void main(String[] args) {
        // Engine engine = new Engine();
        Engine petrolEngine = new PetrolEngine("Honda", "HRV", 1000, "88C");
        Engine dieselEngine = new DieselEngine("Truck", "799", 10000, "88RE");

        petrolEngine.move(20);
        dieselEngine.move(50);
        int milesDrivenByPetrolEngine = petrolEngine.getMileage();
        if(milesDrivenByPetrolEngine == 20) {
            System.out.println("Yes. The miles Driven is :"+milesDrivenByPetrolEngine);
        }else{
            System.out.println("No. Its "+milesDrivenByPetrolEngine);
        }
        int milesDrivenByDieselEngine = dieselEngine.getMileage();
        if(milesDrivenByDieselEngine == 25){
            System.out.println("Yes. It is "+milesDrivenByDieselEngine);
        }else{
            System.out.println("No. Its : "+milesDrivenByDieselEngine);
        }

    }
}
