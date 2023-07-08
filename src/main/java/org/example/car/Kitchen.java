package org.example.car;

import org.apache.poi.hpsf.Decimal;
import org.example.car.mechanic.Parameters;

import java.math.BigInteger;
import java.util.List;

public class Kitchen {

    private String stove;
    private String zerothTime;
    private String c13131;
    private String blender;

    private int numeric;
    private float decimalValue;
    private long longNumericValue;
    private double doubleDecimalValue;
    private char singleCharacter;
    private boolean eitherTrueOrFalse;

    private BigInteger bigInteger;
    private Integer integer;
    private Decimal decimal;

    public void grindChutney(String peanut, String water, String salt, Integer grindingTime)
    {
        for(int i=0; i<= grindingTime; i++){
            System.out.println(" Grind in "+blender);
        }
    }

    public void grindChutney(List<Parameters> grindingParameters)
    {
//        for(int i=0; i<= grindingTime; i++){
//            System.out.println(" Grind in "+blender);
//        }
    }

    public Integer grindChutney(GrindingParameters grindingParameters)
    {
//        for(int i=0; i<= grindingTime; i++){
//            System.out.println(" Gridn in "+blender);
//        }
        return 20;
    }


    public static void main(String[] args) {
        System.out.println("adasd");
    }
}
