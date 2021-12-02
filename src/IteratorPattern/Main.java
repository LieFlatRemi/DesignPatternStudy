package IteratorPattern;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.addBook(new Book("Bible"));
        bookShelf.addBook(new Book("JAVA Design Pattern"));
        bookShelf.addBook(new Book("Journey To The West"));
        bookShelf.addBook(new Book("QAQ TAT OvO"));
        Iterator iterator = bookShelf.getIterator();
        while(iterator.hasNext()){
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}
