package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Мы берём книгу из UniLibrary");
        printSplitter();
    }

    public void getBook(Book book) {
        System.out.println("Мы берём книгу из UniLibrary " + book.getName());
        printSplitter();
    }

    public void getMagazine() {
        System.out.println("Мы берём журнал из UniLibrary");
        printSplitter();
    }

    public Book returnBook(Book book) {
        System.out.println("Мы возвращаем книгу в UniLibrary " + book.getName());
        printSplitter();
        return book;
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в UniLibrary");
        printSplitter();
    }

    public void addBook() {
        System.out.println("Мы добавляем книгу в UniLibrary");
        printSplitter();
    }

    public void addBook(String userName, Book book) {
        System.out.println(userName + " добавляет книгу " + book + " в UniLibrary");
        printSplitter();
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary");
        printSplitter();
    }

    private void printSplitter() {
        System.out.println("----------------------------------------------------------");
    }
}
