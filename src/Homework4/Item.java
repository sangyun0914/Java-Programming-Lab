package Homework4;

public abstract class Item {

    private String barcode;
    private int importPrice;

    public Item(String code, int price) {
        this.barcode = code;
        this.importPrice = price;
    }

    public int getImportPrice() {
        return this.importPrice;
    }

    abstract int getSalePrice();

    abstract String getTitle();

}
