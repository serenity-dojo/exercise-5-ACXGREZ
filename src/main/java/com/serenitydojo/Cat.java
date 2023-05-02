package com.serenitydojo;


public class Cat extends Pet {
//    private String name;
    private String favoriteToy;
//    private int age;

    public Cat(String name, int age, String favoriteToy) {
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
    @Override
    public String play() {
        return "plays with string";
    }
}
