package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;


public class MyPointcuts {
    @Pointcut("execution(* get*())")
    protected void allGetMethods() {}

    @Pointcut("execution(* add*(..))")
    protected void allAddMethods() {}
}
