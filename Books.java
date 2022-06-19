package Homework3;

import java.util.Scanner;

public class Books {
    private String name;
    private int numberOfPages;

    public Books(String name, int numberOfPages){
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }
}
