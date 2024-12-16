package org.example;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(){
        super("Некорректный размер массива");
    }

}
