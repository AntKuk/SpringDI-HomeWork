package com.netcracker.injectingtypes.ci;

import java.util.Objects;

public class RusPublisher implements IPublisher{
    private String publisher;

    public RusPublisher(String publisher) {
        System.out.println("Inside RusPublisher");
        this.publisher = publisher;
    }

    public void publish() {
        System.out.println("Book1 published in Russian by " + publisher);
    }

    @Override
    public String toString() {
        return publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RusPublisher that = (RusPublisher) o;
        return publisher.equals(that.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisher);
    }
}
