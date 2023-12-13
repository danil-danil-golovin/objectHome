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

    @Override
    public String toString() {
        return "Book{" +
                "Название киниги - '" + name + '\'' +
                ", год публикации - " + publisherYear +
                ", автор - " + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publisherYear == book.publisherYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }


}

