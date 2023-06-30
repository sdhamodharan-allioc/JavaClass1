package org.example.inheritance;

import javax.management.DescriptorKey;

public class PetrolEngine extends Engine{

    private String gasoleneGrade;
    public PetrolEngine(String name, String model, int horsePower, String gasoleneGrade) {
        super(name, model, horsePower);
        this.gasoleneGrade = gasoleneGrade;
    }

    @Override
    public int getMileage(){
        return 2 * calculateMileage();
    }

//    @Override
//    protected int gasOrDieselFiled() {
//        return 100;
//    }
}
