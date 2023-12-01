package model;

public class Postid {
    private static long counter = 0;
    public static long geneteId(){
        return ++counter;
    }

}
