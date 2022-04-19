package Homework4;

import Homework4.Cart;

public class MarketCart implements Cart {

	private int MAX_ITEM = 100;
	private Item items[] = new Item[MAX_ITEM];
	private int itemNum = 0;
	private String buyerName;

	public MarketCart(String buyerName) {
		this.buyerName = buyerName;
	}

	public int getNumberOfItems() {
		return this.itemNum;
	}

	public void addItem(Item i) {
		if (this.itemNum < MAX_ITEM) {
			this.items[itemNum++] = i;
		} else
			System.out.println("Max Items Reached!");
	}

	public void printReceipt() {
		int totalWon = 0;
		System.out.println("Receipt:");
		System.out.println("Buyer: " + this.buyerName);
		for (int i = 0; i < this.getNumberOfItems(); i++) {

			totalWon += this.items[i].getSalePrice();
			System.out.printf("%d. %-40s %,6d W\n", i + 1, this.items[i].getTitle(), this.items[i].getSalePrice());
		}
		System.out.printf(this.buyerName + ": %39s %,6d W\n", " ", totalWon);
	}

}
