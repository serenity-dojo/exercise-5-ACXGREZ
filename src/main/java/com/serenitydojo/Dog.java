package com.serenitydojo;

public class Dog extends Pet{
    private String favoriteToy;
    private boolean isFed = false;

    public static final String DOG_NOISE = "Woof";

    public Dog(String name,int age,String favoriteToy) {
        super(name,age);
        this.favoriteToy = favoriteToy;
//        this.age = age;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public boolean isFed() {
        return isFed;
    }

    // Exercise 4
    public String makeNoise() {return DOG_NOISE;}

    public void feed() {
        this.isFed = true;
    }
    @Override
    public String play() {
        return "plays with bone";
    }
}
