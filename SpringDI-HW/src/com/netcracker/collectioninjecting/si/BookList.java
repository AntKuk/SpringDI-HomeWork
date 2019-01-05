package com.netcracker.collectioninjecting.si;

import com.netcracker.injectingtypes.ci.Book;

import java.util.List;

public class BookList {
    List<Book> list;

    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        System.out.println("It's a setter-based list");
        this.list = list;
    }
}
