package com.pb.cheverev.hw5;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        /*Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book("Role play","Stahanov",1957);
        Reader reader1 = new Reader();
        book1.setBookAuthor("Bulgakov");
        book1.setBookTitle("Master and Margarita");
        book1.setYearPublishing(1965);


        book1.AboutBook();

        reader1.setFio("Ivanov Ivan");
        reader1.setFaculty("Filologia");
        reader1.setDateOfBirth(1985);
        reader1.setLibraryCardNumber(001);
        reader1.setPhoneNumber("0953334395");

        reader1.AboutReader();
        reader1.takeBook(5);
        reader1.takeBook("Action", "RPG", "Strategy");
        reader1.takeBook(book1,book2,book3);

        reader1.returnBook(10);
        reader1.returnBook("rpg","action" );
        reader1.returnBook(book1,book2,book3);

        Book[] arraybook = new Book[];
        Arrays.
*/
        Scanner scan = new Scanner(System.in);
        int sizeBook, sizeReader;
        System.out.println("Enter number books: ");
        sizeBook = scan.nextInt();
        Book[] books = new Book[sizeBook];
        System.out.println("Enter number student: ");
        sizeReader = scan.nextInt();
        Reader[] readers = new Reader[sizeReader];
        for (int i=0; i<sizeBook; i++ ){
            Scanner scan1 = new Scanner(System.in);
            books[i] = new Book();
            System.out.println("Enter Book Author: ");
            books[i].setBookAuthor(scan1.nextLine());
            System.out.println("Enter Book Title: ");
            books[i].setBookTitle(scan1.nextLine());
            System.out.println("Enter Book Year: ");
            books[i].setYearPublishing(scan1.nextInt());
        }
        for(int i=0; i<sizeReader; i++ ){
            Scanner scan1 = new Scanner(System.in);
            readers[i] = new Reader();
            System.out.println("Enter Fio student: ");
            readers[i].setFio(scan1.nextLine());
            System.out.println("Enter Faculty student: ");
            readers[i].setFaculty(scan1.nextLine());
            System.out.println("Enter PhoneNumber student: ");
            readers[i].setPhoneNumber(scan1.nextLine());
            System.out.println("Enter Library Card Number student: ");
            readers[i].setLibraryCardNumber(scan1.nextInt());
            System.out.println("Enter date of birth student: ");
            readers[i].setDateOfBirth(scan1.nextInt());
        }
        for (Book b: books)
            b.AboutBook();
        System.out.println("----------------------------");
        for (Reader r: readers) {
            r.AboutReader();
            System.out.println("----------------------------");
        }
        readers[0].takeBook(3);
        readers[0].takeBook("Rpg","Sport","action");
        readers[0].takeBook(books);
        System.out.println("----------------------------");

        readers[0].returnBook(10);
        readers[0].returnBook("Rpg","Sport","action");
        readers[0].returnBook(books);
    }
}
