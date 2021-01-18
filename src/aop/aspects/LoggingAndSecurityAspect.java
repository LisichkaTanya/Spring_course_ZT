package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnBook())")
//    private void returnBookFromUniLibrary() {}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnBookFromUniLibrary()")
//    private void allMethodsExceptReturnBookFromUniLibrary() {}
//
//    @Before("allMethodsExceptReturnBookFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnBookFromUniLibraryAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnBookFromUniLibraryAdvice: Log #10");
//    }


//    @Pointcut("execution(* get*())")
//    private void allGetMethods() {}
//
//    //("execution(public void get*(*, ..))")
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу/журнал");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
//    }
//
//    @Before("execution(* returnBook())") //("execution(public void getBook())") - называется pointCut
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка вернуть книгу");
//    }
}
