package com.netcracker.injectingtypes.si;

public class RusPublisher implements IPublisher {
    private String publisher;

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void publish() {
        System.out.println("Book1 published in Russian by " + publisher);
    }

    @Override
    public String toString() {
        return publisher;
    }
}
