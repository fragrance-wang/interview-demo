package com.atws.zgtt;

public class Person {
    String name;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void print() {
        System.out.println("name: " + this.name + ", age: " + this.age);
    }
}
