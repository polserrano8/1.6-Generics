package org.example.Model;

public class StartPoint {

    public StartPoint(){
        NoGenericMethods StartingClass1 = new NoGenericMethods("Pol","Paula","Pau");
        NoGenericMethods StartingClass2 = new NoGenericMethods("Paula","Pol","Pau");
        NoGenericMethods StartingClass3 = new NoGenericMethods("Pol","Pau","Paula");
        System.out.println(StartingClass1.toString());
        System.out.println(StartingClass2.toString());
        System.out.println(StartingClass3.toString());
    };




}
