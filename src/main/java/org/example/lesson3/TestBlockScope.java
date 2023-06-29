package org.example.lesson3;

public class TestBlockScope {
    public static void main(String[] args) {
        int i = 10;
        {
            int j = 10;
            j--;
        }
        {
            int j = 20;
            i++;
        }
        System.out.println(i);
    }
}
