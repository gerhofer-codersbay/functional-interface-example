package com.codersbay;

public class Main {

    public static void main(String[] args) {

        UpperCaser upperCaser = new UpperCaser();
        System.out.println(upperCaser.modify("hello world"));

        modifyWithLogging("hello world", upperCaser);

        modifyWithLogging("hello world", (original) -> {
            return original.replace("hello", "bye");
        });

        concateWithLogging("Hello World", "Good Night",
                (a, b) -> a + "\n...\n...\n" + b );

        doIrrelevantWithLogging("Hello gustav", (original) -> {
            System.out.println("This is irrelevant: " + original);
        });

    }

    // method that accepts a functional interface as parameter
    public static void modifyWithLogging(String original, StringModifier modifier) {
        String modifiedString = modifier.modify(original);
        System.out.printf("%s is modified to %s\n", original, modifiedString);
    }

    public static void concateWithLogging(String a, String b, MyConcatinator concatinator) {
        String modifiedString = concatinator.concat(a, b);
        System.out.printf("%s and %s are combined to %s\n", a, b, modifiedString);
    }

    public static void doIrrelevantWithLogging(String value, MyBlankInterface myBlankInterface) {
        myBlankInterface.doSomethingIrrelevant(value);
        System.out.printf("called a blank interface with %s \n", value);
    }

}
