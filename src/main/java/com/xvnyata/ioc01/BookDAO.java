package com.xvnyata.ioc01;

/**
 * Created by xvnyata on 2017/7/30.
 */
public class BookDAO implements lBookDAO {
    @Override
    public String addBook(String bookname) {
        return "添加图书成功"+bookname+"成功";
    }
}
