package com.pb.cheverev.hw5;

public class Book {
    private String BookTitle;
    private String BookAuthor;
    private int YearPublishing;


    public Book() {
        this.BookTitle = "No Title";
        this.BookAuthor = "No Author";
        this.YearPublishing = 0;
    }
    public Book(String BookTitle, String BookAuthor, int YearPublishing){
        this.BookTitle = BookTitle;
        this.BookAuthor = BookAuthor;
        this.YearPublishing = YearPublishing;
    }


    public void setBookAuthor(String bookAuthor) {
        this.BookAuthor = bookAuthor;
    }

    public void setBookTitle(String bookTitle) {
        this.BookTitle = bookTitle;
    }

    public void setYearPublishing(int yearPublishing) {
        this.YearPublishing = yearPublishing;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public int getYearPublishing() {
       return YearPublishing;
    }

    public void AboutBook(){
        System.out.println("Title book: " + BookTitle);
        System.out.println("Author book: " + BookAuthor);
        System.out.println("The year of publishing: " + YearPublishing);
    }

    public void PrintForReader(){
        System.out.print(BookTitle + " (" + BookAuthor + " " + YearPublishing + " year)");
    }
}
