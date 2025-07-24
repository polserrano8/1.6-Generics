package org.example.model;


public class StartPoint {
    public StartPoint(){
        Person person1 = new Person("Pol","Serrano",29);
        GenericMethods<Object> generic = new GenericMethods<>();
        generic.genericMethod(person1.getSurName(),person1,person1.getAge());
        generic.genericMethod(person1.getName(),person1,person1.getSurName());

    };
}
