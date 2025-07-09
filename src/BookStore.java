
public class BookStore {
	
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addBook(new PaperBook("111", "Java Basics", 2018, 100.0, 10));
        inventory.addBook(new EBook("222", "Python Advanced", 2020, 50.0, "PDF"));
        inventory.addBook(new DemoBook("333", "C++ Demo", 2015));

        double paid1 = inventory.buyBook("111", 2, "buyer1@example.com", "123 Street");
        System.out.println("Quantum book store: Paid " + paid1 + " for paper book");

        double paid2 = inventory.buyBook("222", 1, "buyer2@example.com", "N/A");
        System.out.println("Quantum book store: Paid " + paid2 + " for eBook");

        try {
            inventory.buyBook("333", 1, "buyer3@example.com", "N/A");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        inventory.removeOutdatedBooks(2019);
    }
}
