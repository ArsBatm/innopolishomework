package innopolis.java.lesson17;


/**
 * Класс для добавления новой книги
 */
public class Book  {
/*
Переменные названия, автора и года выпуска книги
 */
    private String title;
    private String author;
    private String year;
/*
Констурктор для книги
 */
    public Book(String title, String author, String year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
