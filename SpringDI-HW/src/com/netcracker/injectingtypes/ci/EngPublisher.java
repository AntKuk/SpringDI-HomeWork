package com.netcracker.injectingtypes.ci;

import java.util.Objects;

public class EngPublisher implements IPublisher {
    private String publisher;

    public EngPublisher(String publisher) {
        System.out.println("Inside EngPublisher");
        this.publisher = publisher;
    }

    public void publish() {
        System.out.println("Book1 published in English by " + publisher);
    }

    @Override
    public String toString() {
        return publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EngPublisher that = (EngPublisher) o;
        return publisher.equals(that.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisher);
    }
}
