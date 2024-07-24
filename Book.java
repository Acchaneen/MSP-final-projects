/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Haneen
 */
public class Book {
    // Book.java

    private int id;
    private String title;
    private String publishingDate;
    private int version;
    private Author author;
    

    public Book(int id, String title, String publishingDate, int version, Author author) {
        this.id = id;
        this.title = title;
        this.publishingDate = publishingDate;
        this.version = version;
        this.author = author;
    }

    // Getters and setters for all fields
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishingDate() {
        return publishingDate;
    }

    public int getVersion() {
        return version;
    }

    public Author getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishingDate(String publishingDate) {
        this.publishingDate = publishingDate;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int id) {
        books.removeIf(book -> book.getId() == id);
    }

    
public void listBooks() {
    for (Book book : books) {
        library.printAuthorBooks(1);

    }
}               
            }
        
    


