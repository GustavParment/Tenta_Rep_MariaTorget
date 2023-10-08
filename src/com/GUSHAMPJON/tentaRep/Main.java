package com.GUSHAMPJON.tentaRep;

public class Main {

    public static void main(String[] args) {

     VisibiltyModifiers vis = new VisibiltyModifiers();
     vis.keyWrodPublic();
     vis.NoMod();

     ErrorSymboler e = new ErrorSymboler();
     e.checkedExceptions();
     e.uncheckedExceptions();

     CaseSensitivity c = new CaseSensitivity();
     c.camelCase();

     IfSatserOchForLoops i = new IfSatserOchForLoops();
     i.myIfSats();
     i.myLoop();

     DatatypeAndVariables type = new DatatypeAndVariables();

     //TODO in this instantiation "frida" is the object
     Objekt frida = new Objekt("Frida", 22);

     System.out.println(frida.age);//TODO Obejct + method
     System.out.println(frida.name);


     new Uml();
     // Ctrl + click if you are a Windows user
     // Command   + click if you are a gay Mac user....

     new Interface();
     // Ctrl + click if you are a Windows user
     // Command   + click if you are a gay Mac user....

     new Abstract();
     // Ctrl + click if you are a Windows user
     // Command   + click if you are a gay Mac user....

     new Polymorphism();
     // Ctrl + click if you are a Windows user
     // Command   + click if you are a gay Mac user....

     new JunitEnhetstester();
     // Ctrl + click if you are a Windows user
     // Command   + click if you are a gay Mac user....

     new Problemlosning();
     // Ctrl + click if you are a Windows user
     // Command + click if you are a gay Mac user....




    }
}
