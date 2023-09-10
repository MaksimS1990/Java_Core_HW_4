package ru.geekbrains;

public class MyArraySizeException extends Exception {

    /**
     * Исключение, когда размер массива не соответствует условиям
     */
    public MyArraySizeException(String message) {
        super(message);
    }

}
