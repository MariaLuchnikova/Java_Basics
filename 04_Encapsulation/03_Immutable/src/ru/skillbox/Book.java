package ru.skillbox;

public class Book {
    private final String name;
    private final String author;
    private final int kolPages;
    private final String numberISBN;

    public Book(String name, String author, int kolPages, String numberISBN) {
        this.name = name;
        this.author = author;
        this.kolPages = kolPages;
        this.numberISBN = numberISBN;
    }

    public static void main(String[] args) {
        Book book = new Book("War and Peace", "Leo Tolstoy", 900, "978-5-57393-784-4");
        // book.name = "Harry Potter"; // получаем ошибку
        System.out.println(book.getName());
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getKolPages() {
        return kolPages;
    }

    public String getNumberISBN() {
        return numberISBN;
    }
}
