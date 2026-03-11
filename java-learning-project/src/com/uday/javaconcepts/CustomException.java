package com.uday.javaconcepts;

import java.io.Serializable;

public class CustomException extends Exception {

    public CustomException(String message) {
        throw  new RuntimeException(message);
    }
}