package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {

        System.out.println("beforeGetBookAdvice: логирование попытки получить книгу/журнал");
        System.out.println("----------------------------------------------------------");
    }

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSignature = " + methodSignature);
        System.out.println("MethodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("MethodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("MethodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object object : arguments) {
                if (object instanceof Book) {
                    System.out.println("Информация о книге " + object);
                } else if (object instanceof String) {
                    System.out.println("Книгу добавляет " + object);
                }
            }
        }

        System.out.println("beforeGetBookAdvice: логирование попытки добавить книгу/журнал");
        System.out.println("----------------------------------------------------------");
    }

}
