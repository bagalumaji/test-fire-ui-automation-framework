package com.bagal.exceptions;

public class InvalidBrowserNameException extends RuntimeException{
    public InvalidBrowserNameException(){
        super();
    }
    public InvalidBrowserNameException(String message){
        super(message);
    }
}
