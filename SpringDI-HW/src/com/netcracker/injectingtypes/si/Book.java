package com.netcracker.injectingtypes.si;

public class Book {
    private IPublisher publisher;
    private int pages;
    private String title;

    public void setPublisher(IPublisher publisher) {
        this.publisher = publisher;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public void read() {
        System.out.println("You've read " + title);
    }
}
