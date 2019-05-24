package com.coffee.spring.s06.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class StuInterceptor {
    @Pointcut("execution(* com.coffee.spring.s06.aop.aspect.Student.*(..))")
    public void myPointcut(){
        System.out.println("hahaha");
    }
    @Before("myPointcut()")
    public void AfterAdvice(){
        System.out.println("最终通知！");
    }
    @After("myPointcut()")
    public void BeforeAdvice(){
        System.out.println("前置通知！");
    }
    @AfterReturning(pointcut="myPointcut()",returning="returnValue")
    public void log(JoinPoint point,Object returnValue){
        System.out.println("@After目标方法："+point.getSignature().getDeclaringTypeName()+"|"
                +point.getSignature().getName());
        System.out.println("@After参数："+Arrays.toString(point.getArgs()) );
        System.out.println("@Ater返回值："+returnValue);
        System.out.println("@after被织入对象"+point.getTarget());
    }
    @Around("myPointcut()&&args(name,..)")
    public Object pointAroundAdvise(ProceedingJoinPoint pjp,String name) throws Throwable{
        System.out.println("Around!");
        Object result=null;

        if(pjp.getArgs().equals("coffeeliu")) {
            pjp.proceed();
        } else {
            System.out.println("函数被拦截！");
        }
        return result;
    }

}
