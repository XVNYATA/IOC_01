package com.xvnyata.ioc01;

import java.awt.print.Book;

/**
 * Created by xvnyata on 2017/7/30.
 */
public class Test {
    @org.junit.Test
    public void testStoreBook(){
        BookService bookService=new BookService();
        bookService.storeBook("Spring 学习IOC");
    }
}
