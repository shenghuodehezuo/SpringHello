package com.coffee.spring.s06.aop.advice;

public class StudentImpl implements IStudent {
    private String name;
    private int age ;
    private int StuID;

    public String study(String name) {
        System.out.println("study:name"+name+"age"+age);
        return "study:"+name+age;
    }

    public String sleep(String name) {
        System.out.println("sleep:name"+name+"age"+age);
        return "sleep:"+name+age;
    }

    public String run(String name) {
        System.out.println("run:name"+name+"age"+age);
        return "run:"+name+age;
    }

    public StudentImpl() {
    }

    public StudentImpl(String name, int age, int stuID) {
        this.name = name;
        this.age = age;
        StuID = stuID;
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

    public int getStuID() {
        return StuID;
    }

    public void setStuID(int stuID) {
        StuID = stuID;
    }
}

