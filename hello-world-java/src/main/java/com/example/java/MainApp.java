package com.example.java;

import com.example.java.helpers.Printer;
import com.example.java.services.ServiceA;
import com.example.java.services.ServiceB;
import com.example.java.services.ServiceC;

class MainApp {
    public static void main(String[] args) {
        System.out.println("hello world Java");
        Printer.print();
        (new ServiceA()).print();
        (new ServiceB()).print();
        (new ServiceC()).print();
    }
}