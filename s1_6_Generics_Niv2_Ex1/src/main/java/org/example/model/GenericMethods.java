package org.example.model;

public class GenericMethods<T> {

    public GenericMethods(){}

    public void genericMethod ( T generic1,T generic2, String name1 ){
        System.out.println(generic1 + ", "+ generic2 +", " + name1);
    }
    public void genericMethod ( T generic1, String name1, T generic2){
        System.out.println(generic1 + ", " + name1 + ", " + generic2 );
    }
    public void genericMethod ( String name1, T generic1, T generic2){
        System.out.println(name1 + ", " + generic1 + ", " +generic2 );
    }
}
