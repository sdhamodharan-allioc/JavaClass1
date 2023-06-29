package org.example.inheritance;

import java.util.Objects;

//Base Class - Super class - Parent
public abstract class Engine {
    private String name;
    private String model;
    private int horsePower;
    private int milesDriven;
    private int mileage;

    public Engine(String name, String model, int horsePower) {
        this.name = name;
        this.model = model;
        this.horsePower = horsePower;
    }

    //All getters are accessors.
    public String getName() {
        return name;
    }

    //All setters are Mutators
    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void move(int miles){
        System.out.println("Move " +name + " : " + miles +" miles");
        recordMilesDriven(miles);
    }

    private void recordMilesDriven(int miles) {
        milesDriven += miles; // milesDriven = milesDriven + miles
    }


    protected int calculateMileage(){
        return milesDriven ;// gasOrDieselFiled();
    }


//
//    //Dictating your child to take care. This is their future.
//    protected abstract int gasOrDieselFiled();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return horsePower == engine.horsePower && Objects.equals(name, engine.name) && Objects.equals(model, engine.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, horsePower);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", milesDriven=" + milesDriven +
                '}';
    }
}
