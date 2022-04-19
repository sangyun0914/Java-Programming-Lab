package Homework4;

import Homework4.Item;

public class Movie extends Item {

	private String movieTitle;
	private int publishedYear;

	public Movie(String code, int price, String title, int year) {
		super(code, price);
		this.movieTitle = title;
		this.publishedYear = year;
	}

	public String getTitle() {
		return this.movieTitle;
	}

	public int getYear() {
		return this.publishedYear;
	}

	public int getSalePrice() {
		return (int) (this.getImportPrice() * 1.2);
	}

}