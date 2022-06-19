package Homework3;

public class Novels extends Books{
    private String type;

    public Novels(String name, int numberOfPages, String type) {
        super(name, numberOfPages);
        this.type = type;
    }
}
