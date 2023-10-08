package com.GUSHAMPJON.tentaRep;

public class Polymorphism {

    //TODO Polymorphism is a fundamental concept in object-oriented-
    // programming (OOP) that allows objects of different classes to-
    // be treated as objects of a common superclass. It enables you to-
    // write more flexible and reusable code by allowing different objects-
    // to respond to the same method or operation in a way that is appropriate-
    // for their specific class.

    int age;
    String name;
    boolean isTired;


    public Polymorphism(int age, String name, boolean isTired) {
        this.age = age;
        this.name = name;
        this.isTired = isTired;
    }

    //TODO - Polymorphism example
    @Override
    public String toString() {
        return "Polymorphism{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isTired=" + isTired +
                '}';
    }
}
