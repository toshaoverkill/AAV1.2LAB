package ru.java.aav.lab12;
import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        ru.java.aav.lab1.Ball d1 = new ru.java.aav.lab1.Ball("Russia", 20);
        ru.java.aav.lab1.Ball d2 = new ru.java.aav.lab1.Ball("Ukraine", 23);
        ru.java.aav.lab1.Ball d3 = new ru.java.aav.lab1.Ball("USA");
        d3.setRadius(1);
        System.out.println(d1);
        d1.intoIn();
        d2.intoIn();
        d3.intoIn();
    }
}
