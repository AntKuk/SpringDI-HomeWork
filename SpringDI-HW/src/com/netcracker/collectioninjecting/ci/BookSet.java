package com.netcracker.collectioninjecting.ci;

import com.netcracker.injectingtypes.ci.Book;

import java.util.Set;

public class BookSet {
    Set<Book> set;

    public BookSet(Set<Book> set) {
        this.set = set;
    }

    public Set<Book> getSet() {
        return set;
    }
}
