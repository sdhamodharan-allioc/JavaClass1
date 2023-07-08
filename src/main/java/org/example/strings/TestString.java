package org.example.strings;

public class TestString {
    public static void main(String[] args) {
        String texas = "Texas";
        String tennessee = "Tennessee";
        System.out.println( texas.compareTo(texas));
        System.out.println( texas.compareTo(tennessee));
        System.out.println( tennessee.compareTo(texas));
        String houston = "Houston";
        String houstonian = "Houstonian";
        System.out.println( houston.compareTo(houston));
        System.out.println( houston.compareTo(houstonian));
        System.out.println( houstonian.compareTo(houston));
    }
}
