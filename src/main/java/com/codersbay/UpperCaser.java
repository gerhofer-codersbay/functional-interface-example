package com.codersbay;

public class UpperCaser implements StringModifier {
    @Override
    public String modify(String original) {
        return original.toUpperCase();
    }
}
