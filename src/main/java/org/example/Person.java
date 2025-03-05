package org.example;

public class Person {

    String firstname;
    String lastname;
    int age;
    String eyecolor;
    String mothername;
    double heigth;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstname, String lastname, int age, String eyecolor, String mothername, double heigth) {
        this(firstname, lastname, age);
        this.eyecolor = eyecolor;
        this.mothername = mothername;
        this.heigth = heigth;
    }

    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }

}


