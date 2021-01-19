package aop.aspects;

import aop.Book;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public aop.Book returnBook(aop.Book) )")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint point) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу");
        Object targetMethodResult = point.proceed();
        //targetMethodResult = new Book("Робинзон Крузо", "Даниэль Дефо", 1719 );
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно возвращают книгу");
        return targetMethodResult;
    }
}
