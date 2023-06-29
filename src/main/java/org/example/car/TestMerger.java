package org.example.car;

import java.util.Set;
import java.util.TreeSet;

public class TestMerger {

    public static void main(String[] args) {
        String firstArray[] = {"Apple", "Orange", "Banana", "Grapes"};
        String secondArray[] = {"Strawberries", "Banana", "Lychee"};

        Set<String> resultSet = new TreeSet<>();
        for(String firstString : firstArray){
            resultSet.add(firstString);
        }

        for(String secondString: secondArray){
            resultSet.add(secondString);
        }

        System.out.println(resultSet);
    }
}
