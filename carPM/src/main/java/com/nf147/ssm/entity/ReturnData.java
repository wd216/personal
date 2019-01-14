package com.nf147.ssm.entity;

import org.springframework.stereotype.Component;

import java.util.List;

public class ReturnData {
    private List<Book> books;
    private List<Booktype> btypes;
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Booktype> getBtypes() {
        return btypes;
    }

    public void setBtypes(List<Booktype> btypes) {
        this.btypes = btypes;
    }
}
