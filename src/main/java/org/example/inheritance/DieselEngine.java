package org.example.inheritance;

public class DieselEngine extends Engine {
    private String dieselGrade;

    public DieselEngine(String name, String model, int horsePower, String dieselGrade) {
        super(name, model, horsePower);
        this.dieselGrade = dieselGrade;
    }

//    @Override
//    protected int gasOrDieselFiled() {
//        return 200;
//    }

    public int getMileage(){
        return calculateMileage();
    }

}
