package com.netcracker.collectioninjecting.si;

import com.netcracker.injectingtypes.ci.Book;

import java.util.Set;

public class BookSet {
    Set<Book> set;

    public Set<Book> getSet() {
        return set;
    }

    public void setSet(Set<Book> set) {
        System.out.println("It's a setter-based set");
        this.set = set;
    }


}
