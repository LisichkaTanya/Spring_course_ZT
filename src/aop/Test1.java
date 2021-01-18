package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
//        uniLibrary.getBook();
//        uniLibrary.getMagazine();
//        uniLibrary.returnBook();
        uniLibrary.addBook();
        Book book = context.getBean("book", Book.class);
        uniLibrary.addBook("Tatiana", book);
        uniLibrary.addMagazine();
//
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
