import java.util.Objects;

public class Book {
    private String name;
    private int publisherYear;
    private Author author;

    public Book(String name, int publisherYear, Author author) {
        this.name = name;
        this.publisherYear = publisherYear;
        this.author = author;
    }

    public String getName() {

        return this.name;
    }

    public int getPublisherYear() {

        return this.publisherYear;
    }

    public void setPublisherYear(int publisherYear) {

        this.publisherYear = publisherYear;
    }

    public Author getAuthor() {
        return this.author;
    }
}

