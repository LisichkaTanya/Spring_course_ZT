package aop.aspects;

import aop.university.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);
        firstStudent.setNameSurname("Ms " + firstStudent.getNameSurname());
        firstStudent.setAvgGrade(firstStudent.getAvgGrade() + 1);

        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов после метода getStudents");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {

        System.out.println("beforeGetStudentsLoggingAdvice: логируем выброс исключения '" + exception +
                "' после метода getStudents");
    }

}
