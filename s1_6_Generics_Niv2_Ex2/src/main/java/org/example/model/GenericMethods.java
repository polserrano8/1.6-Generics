package org.example.model;

public class GenericMethods<T> {

    public GenericMethods(){}

    @SafeVarargs
    public final void genericMethod(String name1, T... generics){
        System.out.println(name1);
        for(T generic: generics){
            System.out.println(generic);
        }
    }
}
