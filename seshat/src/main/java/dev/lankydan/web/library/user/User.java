package dev.lankydan.web.library.user;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

public class User{

    String first_name;
    String last_name;
    String id;
    String password;
    String addr;
    List<Book> borrowed_books;

    public static class Book {
        public String title;
        public String author;
        public Integer isbn;
        public Date date_borrowed;
        public Date return_deadline;
    }

}