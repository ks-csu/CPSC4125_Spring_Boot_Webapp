package com.example.springboot;

public class Blog
{
    private String message;

    public String getMessage(){
        return message;
    }

    public void setMessage(String newMessage){
        this.message = newMessage;
    }
}