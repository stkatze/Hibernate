package com.netology.exceptions;

public class DataSaveException extends RuntimeException {
    public DataSaveException(String message) {
        super(message);
    }
}