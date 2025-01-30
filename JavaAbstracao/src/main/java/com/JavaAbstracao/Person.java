package com.JavaAbstracao;

import java.time.OffsetDateTime;

public class Person {
    private final String name;
    private int age;

    private int lasYearAgeInc = OffsetDateTime.now().getYear();

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void incAge(){
        if(this.lasYearAgeInc >= OffsetDateTime.now().getYear()) return;
        this.age +=1;
        this.lasYearAgeInc = OffsetDateTime.now().getYear();
    }
}
