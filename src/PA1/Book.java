package PA1;

public class Book {
    private int bkID;
    private String bkTitle;
    private String bkAuthor;
    private int bkYear;
    private boolean bkAvailable;

    public Book(String name, String author, int year) {
        this.bkTitle = name;
        this.bkAuthor = author;
        this.bkYear = year;
        this.bkAvailable = true;
    }

    public void setID(int ID) {
        this.bkID = ID;
    }

    public int getID() {
        return this.bkID;
    }

    public String getTitle() {
        return this.bkTitle;
    }

    public String getAuthor() {
        return this.bkAuthor;
    }

    public int getYear() {
        return this.bkYear;
    }

    public boolean getAvail() {
        return this.bkAvailable;
    }

    public void Borrow() {
        this.bkAvailable = false;
    }

    public void Return() {
        this.bkAvailable = true;
    }

}
