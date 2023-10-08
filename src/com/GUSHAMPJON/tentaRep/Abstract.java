package com.GUSHAMPJON.tentaRep;

abstract class Abstract {

    //TODO - subclasses cant inherit from 2 abstract different classes

    //Todo - More secure to use a abstract class

    //TODO - Abstract method in a abstract class
    abstract void bark();

    abstract void sound();

    //TODO - default method in a abstract class
    void testT() {

        System.out.println("Abstract test");

    }
//TODO Use an abstract class when you-
// want to create a base class with some shared implementation and possibly state.
// Use an interface when you want to define a contract that unrelated.
// Classes can adhere to without specifying any implementation details.



}
