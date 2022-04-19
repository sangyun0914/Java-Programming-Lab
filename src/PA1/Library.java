package PA1;

public class Library {
    private final int MAX_BOOK = 10;
    private int bookCount = 0;
    private Book[] Books = new Book[MAX_BOOK];
    private String libName;

    public Library(String name) {
        this.libName = name;
    }

    public String getName() {
        return this.libName;
    }

    public int getCount() {
        return this.bookCount;
    }

    public int getIndex(int index) {
        for (int i = 0; i < bookCount; i++)
            if (Books[i].getID() == index)
                return i;
        return -1;
    }

    public Book getBook(int index) {
        return this.Books[index];
    }

    public void addBook(Book book, int ID) {
        if (bookCount < 10) {
            book.setID(ID);
            Books[bookCount++] = book;
        }

    }

    public void delBook(int ID) {
        for (int i = 0; i < bookCount; i++) {
            if (Books[i].getID() == ID) {
                for (int j = i; j < bookCount - 1; j++) {
                    Books[j] = Books[j + 1];
                }
                break;

            }
        }
        bookCount--;
    }

}
