package com.netcracker.collectioninjecting.ci;

import com.netcracker.injectingtypes.ci.Book;

import java.util.List;

public class BookList {
    List<Book> list;

    public BookList(List<Book> list) {
        this.list = list;
    }

    public List<Book> getList() {
        return list;
    }
}
