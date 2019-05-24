package com.coffee.spring.s06.aop.aspect;

public class Student {
    private String name;
    private int age;
public Student(){}
    public Student(String name, int age) {
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
    public void study(String s,int a){
        System.out.println("study:name"+name+"study:age"+age+s+a);
    }
    public String say(){
        System.out.println("say:name"+name+"say:age"+age);
        return "say"+name+age;
    }
}
