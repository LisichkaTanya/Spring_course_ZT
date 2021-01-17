package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Мы берём книгу из UniLibrary");
    }

    public void getBook(Book book) {
        System.out.println("Мы берём книгу из UniLibrary " + book.getName());
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary");
    }
}
