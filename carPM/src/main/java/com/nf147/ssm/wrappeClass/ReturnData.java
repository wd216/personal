package com.nf147.ssm.wrappeClass;
/**
 * 封装返回类型的数据
 * 因为要返回页面的数据有 书的集合 还有书的类型集合，所以进行包装一下方便操作
 */

import com.nf147.ssm.dao.BookMapper;
import com.nf147.ssm.dao.BooktypeMapper;
import com.nf147.ssm.entity.Book;
import com.nf147.ssm.entity.Booktype;

import java.util.List;

public class ReturnData {
    private List<Book> books;
    private List<Booktype> btypes;
//    private Book book;

    //想定义一个方法判断根据参数判断，是根据 书的类型id 还是 书的名字name 进行查找数据
    // 结果有点复杂，因为传过来的参数 可能是 0 可能是 书名 也可能是 书的类型 这参数不好做判断条件
//    public ReturnData data(String variable, BookMapper mapper, BooktypeMapper bmapper,ReturnData data){
//        //如果传过来的参数是字符串 0 的话就返回所有的数据
//
//        if ("0".equals(variable)){
//            books = mapper.selectAll();
//            data.setBooks(books);
//        }else if (true){
//
//        } else{
//            book = mapper.selectByName(variable);
//            // 先把集合中的数据先清空，怕 books 集合之前有数据，后面的 add 的话可能只是往集合中添加一条
//            books.clear();
//            books.add(0,book);
//            data.setBooks(books);
//        }
//        List<Booktype> btypes = bmapper.selectAll();
//        data.setBtypes(btypes);
//        return data;
//    }


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

//    public Book getBook() {
//        return book;
//    }
//
//
//    public void setBook(Book book) {
//        this.book = book;
//    }
}