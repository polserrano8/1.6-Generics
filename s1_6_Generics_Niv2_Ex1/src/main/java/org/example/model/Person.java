package s1_6_Generics_Niv2_Ex1.src.main.java.org.example.model;

public class Person {
    private String name;
    private String surName;
    private int age;

    public Person(String name, String surName, int age){
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
