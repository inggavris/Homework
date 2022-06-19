package Homework3;

import java.util.Scanner;

public class Books {
    private String name;
    private int numberOfPages;

    public Books () { }

    public Books(String name, int numberOfPages){
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public String addBook() {
        System.out.println("Please insert new book name: ");
        Scanner keyboard = new Scanner(System.in);
        String newBook = keyboard.nextLine();
        return newBook;
    }
}
