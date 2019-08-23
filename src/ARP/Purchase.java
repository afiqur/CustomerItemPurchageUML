package ARP;

public class Purchase {

	public static void main(String[] args) {
		Customer c = new Customer("Kakku", 22, "013241222", "kakku@kakku.com", "C001");
		c.display();
		System.out.println();
		Item i = new Item("14 December, 2018");
		i.display();

		i.setDate(1001, "Cucumber", "2kg", 20.00);
		i.itemDisplay();

		i.setDate(1002, "Banana", "12ps", 12.00);
		i.itemDisplay();

	}

}
