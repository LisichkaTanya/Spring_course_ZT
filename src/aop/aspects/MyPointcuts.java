package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;


public class MyPointcuts {
    @Pointcut("execution(* sget*())")
    protected void allGetMethods() {}

    @Pointcut("execution(* sadd*(..))")
    protected void allAddMethods() {}
}
