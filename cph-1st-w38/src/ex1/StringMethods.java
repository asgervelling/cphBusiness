package src.ex1;

public class StringMethods {
    public void printEmptyLine() {
        System.out.println();
    }

    public void printInput(String s) {
        System.out.println(s);
    }

    public void introduceYourself(String name, int age) {
        /*
        1.d Write a function that receives a string called "name" and an integer called "age" and call it from main
        with your own name and age. Have the function print the text "My name is \<name\>, I am <age> years old".
        */
        System.out.println(String.format("My name is %s, I am %d years old.", name, age));
    }
}
