import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Author Pushkin = new Author("Александр", "Пушкин");

        Book evgeniuOnegin = new Book("Евгений Онегин", 1823, Pushkin);

        Author Tolstoy = new Author("Лев", "Толстой");

        Book voinaMir = new Book("Война и мир", 1966, Tolstoy);

        voinaMir.setPublisherYear(1825);
        System.out.println(Pushkin.getNameAuthor() + " " + Pushkin.getSurnameAuthor() + " - "+ evgeniuOnegin.getName() + ", " + evgeniuOnegin.getPublisherYear());
        System.out.println(Tolstoy.getNameAuthor() + " " + Tolstoy.getSurnameAuthor() + " - " + voinaMir.getName() + ", " + voinaMir.getPublisherYear());

        System.out.println(voinaMir);

        System.out.println(Pushkin.equals(Tolstoy));
    }
}