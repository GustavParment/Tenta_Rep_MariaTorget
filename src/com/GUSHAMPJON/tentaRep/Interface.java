package com.GUSHAMPJON.tentaRep;

public interface Interface {

     //TODO -  subclasses can inherit from 2 different interfaces

    //TODO - These are abstract methods in a interface

    //TODO -  Interface can only have un implemented methods -
    // and they can't have instance, variables or constructors

    void eat();
    void sleep();
    void drink();
    void failTenta();

    //TODO - To creat a method that every  subclass -
    // inherit it needs to be default.

    default void race(){

        System.out.println("Human");

    }

}
