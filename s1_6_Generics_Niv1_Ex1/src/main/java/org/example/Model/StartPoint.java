package org.example.Model;

public class StartPoint {

    public StartPoint(){

        String name1 = "Pol";
        String name2 = "Paula";
        String name3 = "Pau";

        System.out.println(new NoGenericMethods(name1, name2 , name3));
        System.out.println(new NoGenericMethods(name2, name3 , name1));
        System.out.println(new NoGenericMethods(name3, name1 , name2));
    }
}
