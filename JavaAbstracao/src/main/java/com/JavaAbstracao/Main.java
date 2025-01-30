package com.JavaAbstracao;

public class Main {
    public static void main(String[] args) {
        var male = new Person("Peterson");
        male.setAge(12);
        var female = new Person("Jane");
        female.setAge(22);
        System.out.println("Male name: "+ male.getName() + " Age: "+ male.getAge());
        System.out.println("Female name: "+ female.getName() + " Age: "+ female.getAge());
    }
}