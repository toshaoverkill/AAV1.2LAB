package ru.java.aav.lab12;

import java.lang.*;
public class Ball {
    private String footballteam;
    private int radius;
    public Ball(String n, int a){
        footballteam = n;
        radius = a;
    }
    public Ball(String n){
        footballteam = n;
        radius = 0;
    }
    public Ball(){
        footballteam = "Pup";
        radius = 0;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getFootballteam(String footballteam){
        return footballteam;
    }
    public int getRadius() {
        return radius;
    }
    public String toString(){
        return this.footballteam +", radius "+this.radius;
    }
    public void intoIn(){
        System.out.println(footballteam +"'s ball have  "+ radius +" См radius and "+ (radius*0.3)+" In radius");
    }
}