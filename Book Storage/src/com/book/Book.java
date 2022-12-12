package com.book;
public class Book {
    // Data member / attribute with access modifier
    // Cannot changes value
    public  String bookName;
    private int bookStock;
    private double bookPrice;

    // constructor
    Book(String inputBookName) {
        this.bookName = inputBookName;
        this.bookStock = 0;
        this.bookPrice = 0;
    }

         // Implementation encapsulation
        //  Read only
         public int getBookStockInPrivate() {
            return  this.bookStock;
         }

        //  Write only
         public void setBookStockinPrivate(int insertBookStock) {
            this.bookStock = insertBookStock;
         }


         public double getBookPriceInPrivate()  {
            return this.bookPrice;
         }

         public void setBookPriceInprivate(double inputPrice)   {
                this.bookPrice = inputPrice;
         }


         void showBookDetail() {
            System.out.println("Book name : " + this.bookName + "\n" +
            "Stock : "+ this.getBookStockInPrivate() + "\n" + 
            "Price : "+ this.bookPrice);
         }
}