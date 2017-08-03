package com.jasleen.operators.relational.operators;

/**
 * Created by jasleen on 3/12/2017.
 */
public class Dog {

    String name;
    String says;

    Dog(){}
    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public static void main(String[] args) {

        //either we can initiate using default constructor

        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.name="spot";
        d1.says="Ruff";

        d2.name="Scruffy";
        d2.says="wurf";

        // or we can initiate using parameterised constructor

        Dog D1 = new Dog("spot","ruff");
        Dog D2 = new Dog("scruffy","wurf");

        System.out.println("USing default constructor : ");
        System.out.println("Name of first dog = " + d1.name + " and it says = " +d1.says);
        System.out.println("Name of second dog = " + d2.name + " and it says = " +d2.says);
        System.out.println("USing parameterised constructor : ");
        System.out.println("first dog" + "Name of first dog = " + D1.name + " and it says = " +D1.says);
        System.out.println("second dog" +"Name of second dog = " + D2.name + " and it says = " +D2.says );


    }



}
