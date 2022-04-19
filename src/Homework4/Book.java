package Homework4;

import Homework4.Item;

public class Book extends Item {

	private String bookTitle;
	private String bookAuthor;

	public Book(String code, int price, String name, String author) {
		super(code, price);
		this.bookTitle = name;
		this.bookAuthor = author;
	}

	public String getTitle() {
		return this.bookTitle;
	}

	public int getSalePrice() {
		return (int) (this.getImportPrice() * 1.5);
	}

}
