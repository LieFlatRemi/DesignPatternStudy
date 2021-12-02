package IteratorPattern;

public class BookShelfItrator implements Iterator{
    private BookShelf bookShelf;
    private int index;

    public BookShelfItrator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBook(index++);
        return book;
    }
}
