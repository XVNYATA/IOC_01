package com.xvnyata.ioc01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xvnyata on 2017/7/30.
 */
public class BookService {
    lBookDAO bookDAO;

    public BookService(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("IOCBeans01.xml");
        bookDAO=(lBookDAO)ctx.getBean("bookdao");
    }

    public void storeBook(String bookname) {
        System.out.println("图书上架了");
        String  result=bookDAO.addBook(bookname);
        System.out.println(result);
    }
}
