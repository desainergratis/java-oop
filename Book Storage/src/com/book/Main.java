package com.book;
public class Main {
    public static void main(String[] args) {


        Book firstBook = new Book("Kasih tak sampai");
        firstBook.setBookStockinPrivate(3);

        firstBook.setBookPriceInprivate(10000);
        firstBook.getBookPriceInPrivate();
        firstBook.showBookDetail();
        
     
    }
}