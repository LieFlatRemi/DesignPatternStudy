package IteratorPattern;

public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBook(int index) {
        return books[index];
    }

    public void addBook(Book book) {
        if (last == books.length) return;
        books[last++] = book;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator getIterator() {
        return new BookShelfItrator(this);
    }
}
