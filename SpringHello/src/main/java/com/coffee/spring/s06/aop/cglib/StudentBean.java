package com.coffee.spring.s06.aop.cglib;

public class StudentBean {
    private String name;
    private int age;

    public StudentBean() {
    }

    public StudentBean(String name, int age) {
        this.name = name;
        this.age = age;
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
    public void study() {
        System.out.println("study:name"+name+"age"+age);
    }

    public void say() {
        System.out.println("say:name"+name+"age"+age);

    }
}
