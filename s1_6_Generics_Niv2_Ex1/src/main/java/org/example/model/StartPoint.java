package s1_6_Generics_Niv2_Ex1.src.main.java.org.example.model;

public class StartPoint {
    public StartPoint(){
        Person person1 = new Person("Pol","Serrano",29);
        GenericMethods<Object> generic = new GenericMethods<>();
        generic.genericMethod(person1,person1.getName(),person1.getAge());
        generic.genericMethod(person1,person1.getAge(),person1.getName());
        generic.genericMethod(person1.getSurName(),person1,person1.getAge());

    };
}
