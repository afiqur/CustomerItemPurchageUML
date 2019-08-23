package Solve2;

public class Purchase {

	public static void main(String[] args) {
		Customer c = new Customer("Kakku", 22, "013241222", "kakku@kakku.com", "C001");
		c.display();

		System.out.println();

		Item i1, i2;
		i1 = new Item(1001, "Cucumber", "2kg", 20.00);
		i2 = new Item(1002, "Banana", "12ps", 12.00);

		i1.display();
		i1.itemDisplay();
		System.out.println();
		i2.itemDisplay();
		Item.total();

	}

}

