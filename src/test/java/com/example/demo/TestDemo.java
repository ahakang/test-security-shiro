package com.example.demo;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^1\\d{10}$");
        Matcher matcher = pattern.matcher("");
        System.out.println(matcher.matches());
    }
}
