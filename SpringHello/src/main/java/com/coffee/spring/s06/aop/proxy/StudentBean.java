package com.coffee.spring.s06.aop.proxy;

public class StudentBean implements studentInterface {
    private String name;
    private int age;
    public StudentBean(){}
    public StudentBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printName() {
        System.out.println(name);
    }

    public void say() {
        System.out.println("say:name"+name+"age"+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
