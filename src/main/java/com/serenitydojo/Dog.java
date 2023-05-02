package com.serenitydojo;

public class Dog extends Pet{
//    private String name;
    private String favoriteToy;
//    private int age;
    private boolean isFed = false;

    public static final String DOG_NOISE = "Woof";

    public Dog(String name,int age,String favoriteToy) {
        super(name,age);
//        this.name = name;
        this.favoriteToy = favoriteToy;
//        this.age = age;
    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

//    public int getAge() {
//        return age;
//    }

//    public void setAge(int age) {
//        this.age = age;
//    }

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
