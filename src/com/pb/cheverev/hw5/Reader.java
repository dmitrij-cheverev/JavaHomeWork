package com.pb.cheverev.hw5;

public class Reader {
    private String Fio;
    private int LibraryCardNumber;
    private String Faculty;
    private int DateOfBirth;
    private String PhoneNumber;


    public Reader() {
        Fio = "Ivanov I.I.";
        LibraryCardNumber = 1;
        Faculty = "None";
        DateOfBirth = 1900;
        PhoneNumber = "1234567890";

    }

    public String getFio() {
        return Fio;
    }

    public void setFio(String fio) {
        Fio = fio;
    }

    public int getLibraryCardNumber() {
        return LibraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        LibraryCardNumber = libraryCardNumber;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void AboutReader() {
        System.out.println("Fio student: " + Fio);
        System.out.println("Student DateOfBirth: " + DateOfBirth);
        System.out.println("Student phone number: " + PhoneNumber);
        System.out.println("Student Library Card Number: " + LibraryCardNumber);
        System.out.println("Student Faculty: " + Faculty);
    }

    public void takeBook(int amount){
        System.out.println( this.Fio + " take " + amount + " books");
    }

    public void takeBook(String... BookTitle){
        System.out.print(this.Fio + " take books: ");
        for(int i = 0; i < BookTitle.length; i++){
            if(i == BookTitle.length-1)
                System.out.print(BookTitle[i]+"\n");
            else
                System.out.print(BookTitle[i] + ", ");
        }
    }

    public void takeBook(Book... books){
        System.out.print(this.Fio + " take books: ");
        for(int i = 0; i < books.length; i++){
            if( i == books.length-1) {
                books[i].PrintForReader();
                System.out.println();
            }else{
                books[i].PrintForReader();
                System.out.print(", ");
            }

        }
    }

    public void returnBook(int amount){
        System.out.println(this.Fio + " return " + amount + " books");
    }

    public void returnBook(String... BookTitle){
        System.out.print(this.Fio + " return books: ");
        for(int i = 0; i < BookTitle.length; i++){
            if(i == BookTitle.length-1)
                System.out.print(BookTitle[i]+"\n");
            else
                System.out.print(BookTitle[i] + ", ");
        }
    }
    public void returnBook(Book... books){
        System.out.print(this.Fio + " return books: ");
        for(int i = 0; i < books.length; i++){
            if( i == books.length-1) {
                books[i].PrintForReader();
                System.out.println();
            }else{
                books[i].PrintForReader();
                System.out.print(", ");
            }

        }
    }
}
