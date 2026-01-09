package com.example.prac.model;

import java.util.Arrays;

public class todos {
    public int id;
    public String[] note = {"Hello world", "Yohohoho", "Hey", "Bla bla bla"};

    public String success(){
        return "Note created successfully: "+ note;
    }

    public String[] notes(){
        return note;
    }
}
