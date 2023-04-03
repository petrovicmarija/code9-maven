package com.levi9.code9;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world from core module!");

        // upotreba dependency-ja definisanog u parent projektu
        System.out.println(StringUtils.isBlank(""));

        // upotreba klase iz parent projekta
        Calculator calculator = new Calculator();
        int result = calculator.add(4, 5);
        System.out.println("Result is " + result);
    }

}