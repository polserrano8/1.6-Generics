package org.example.model;

public class GenericMethods<T> {

    public GenericMethods(){}

    @SafeVarargs
    public final void genericMethod(T... genericEntrance){
        for(T entrance: genericEntrance){
            System.out.println(entrance);
        }
    }
}
