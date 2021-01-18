package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Преступление и наказание")
    private String name;
    @Value("Ф.М. Достоевский")
    private String author;
    @Value("1866")
    private int yearPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    @Override
    public String toString() {
        return "{'" + name + '\'' +
                ", '" + author + '\'' +
                ", " + yearPublication +
                "'}";
    }
}
