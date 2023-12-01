package model;

public class Userid {
    private static long counter = 0;
    public static long geneteId(){
        return ++counter;
    }

}

