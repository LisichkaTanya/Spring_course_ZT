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
        Object targetMethodResult;
        //targetMethodResult = new Book("Робинзон Крузо", "Даниэль Дефо", 1719 );
        try{
            targetMethodResult = point.proceed();
        }catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: было поймано исключение '" + e +'\'');
            //Так как мы объявили эту переменную null, то при выбросе исключения ничего не запишется в переменную
            //и нам придется вернуть null, чтобы этого избежать надо присвоить значение по умолчанию
            //targetMethodResult = new Book();

            //лучше не прятать проблему, а пробрасывать дальше, чтобы в методе main было видно исключение
            throw e;
        }

        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно возвращают книгу");
        return targetMethodResult;
    }
}
