package Homework3;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Books> myBooks = new ArrayList<Books>();
        myBooks.add(0,new Books("Insula",443));
        myBooks.add(1,new Books("Eseu despre orbire", 410));
        myBooks.add(2,new Books("Fratii Karamazov", 1112));
        myBooks.add(3,new Books("Regina gheturilor", 339));

        ArtAlbums[] myArtAlbums = new ArtAlbums[3];
        myArtAlbums[0] = new ArtAlbums("Salvador Dali", 220, 8);
        myArtAlbums[1] = new ArtAlbums("Kandinski", 280, 10);
        myArtAlbums[2] = new ArtAlbums("Picasso", 370, 9);

        Novels[] myNovels = new Novels[5];
        myNovels[0] = new Novels("320 de pisici negre", 333, "crime");
        myNovels[1] = new Novels("Zuleiha deschide ochii", 550, "drama");
        myNovels[2] = new Novels("Dune", 995, "SF");
        myNovels[3] = new Novels("Castelul", 430, "drama");
        myNovels[4] = new Novels("Schimb de dame", 380, "comic");

        //System.out.println(((myBooks.get(3).getName())));
        System.out.println("Your book list is: ");
        for (Books myBook : myBooks) {
            System.out.println(myBook.getName());
        }
        System.out.println("Please insert new book name: ");
        Books extendBooks = new Books();
        System.out.println("Your new book list is: ");
        for (Books myBook : myBooks) {
            System.out.println(myBook.getName());
            System.out.println(extendBooks.addBook());
        }

        int l1 = myBooks.size();
        System.out.println("Please insert the name of the book you want to delete: ");
        Scanner keyboard = new Scanner(System.in);
        String deleteBook = keyboard.nextLine();
        for (int i = 0; i < myBooks.size(); i++) {
            if (myBooks.get(i).getName().equals(deleteBook)) {
                myBooks.remove(i);
            }
        }
        int l2 = myBooks.size();
        if (l1 == l2) {
            System.out.println("We don't have this book in our library! ");
        }
        else {
            System.out.println("Your book list after deleting one book is: ");
            for (Books myBook : myBooks) {
                System.out.println(myBook.getName());
            }
        }
        System.out.println("Your favourite art album is: " + ((myArtAlbums[0].getName()).toString()));
        System.out.println("Your favourite novel is: " + ((myNovels[1].getName()).toString()));

    }
}
