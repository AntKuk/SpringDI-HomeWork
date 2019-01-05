package com.netcracker.injectingtypes.ci;

import java.util.Objects;

public class Book {
    private IPublisher publisher;
    private int pages;
    private String title;

    public Book(IPublisher publisher, int pages, String title) {
        this.publisher = publisher;
        this.pages = pages;
        this.title = title;
    }

    public void read() {
        System.out.println("You've read " + title);
    }

    public IPublisher getPublisher() {
        System.out.println("Publisher is " + publisher);
        return publisher;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book1{" +
                "publisher=" + publisher +
                ", pages=" + pages +
                ", title='" + title + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages &&
                publisher.equals(book.publisher) &&
                title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisher, pages, title);
    }
}
