package oopsConcept;


class Library{

     String[] books ;
     int no_of_Books ;
    Library(){
        this.books= new String[100] ;
        this.no_of_Books = 0 ;
    }
    void addBook(String book){
        this.books[no_of_Books] =book ;
        no_of_Books++ ;
        System.out.println(book+ "has been added");
    }
    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for(String book:this.books){
           if(book==null){
               continue ;
           }
           System.out.println("*"+ book);
        }
    }
    void issueBook(String book){
        for(int i =0; i<this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] =null ;
                return ;
            }
            System.out.println("*"+ book);
        }
        System.out.println("This book does not Exit");
    }
    void returnBook(String book){
        addBook(book);
    }

}

public class LibraryManagement {
    public static void main(String[] args) {

        // You have to implement a library using Java class Library
        // Methods: issueBook,AddBook , returnBook,ShowAvailable
        // Properties: Array to store the available books,
        // Array to store the issued books

        Library centralLibrary = new Library() ;

        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Rich Dad And Poor Dad");
        centralLibrary.addBook("Habit OF good Things");
        centralLibrary.addBook("Data Structure and Algorithm") ;

        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("Think and grow Rich");
        centralLibrary.issueBook("Data Structure and Algorithm");

        centralLibrary.showAvailableBooks();

        centralLibrary.returnBook("Think and grow Rich");

    }
}
