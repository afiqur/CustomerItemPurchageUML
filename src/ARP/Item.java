package ARP;

public class Item {

	private String purchaseDate;
	private int itemID;
	private String name;
	private String qty;
	private double price;

	public Item(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public void setDate(int itemID, String name, String qty, double price) {
		this.itemID = itemID;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	public void display() {
		System.out.println("Item Purchased:");
		System.out.println("----------------------");
		System.out.println("Purchase date: " + purchaseDate);

	}

	public void itemDisplay() {
		System.out.println(
				"Item ID: " + itemID + "\t" + "Name: " + name + "\t" + "Qty: " + qty + "\t" + "Price: " + price);
	}
}

