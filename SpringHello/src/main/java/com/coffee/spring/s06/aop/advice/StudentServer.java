package com.coffee.spring.s06.aop.advice;

public class StudentServer {
    public void removeStu(int id){
        throw new RuntimeException("删除了！整个人都不好了！runtime");
    }
    public void updateStu(IStudent stu){
        throw new RuntimeException("修改了！怎个人都不好了！SQL");
    }

}
