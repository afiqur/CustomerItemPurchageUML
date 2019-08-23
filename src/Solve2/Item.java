package Solve2;

public class Item {

	private int itemID;
	private String name;
	private String qty;
	private double price;

	public static double total = 0;

	public Item(int itemID, String name, String qty, double price) {
		this.itemID = itemID;
		this.name = name;
		this.qty = qty;
		this.price = price;
		total += price;
	}

	public void display() {
		System.out.println("Item Purchased:");
		System.out.println("----------------------");

	}

	public void itemDisplay() {
		System.out
				.print("Item ID: " + itemID + "\t" + "Name: " + name + "\t" + "Qty: " + qty + "\t" + "Price: " + price);
	}

	public static void total() {
		System.out.println("\tTotal: BDT " + total);
	}
}


