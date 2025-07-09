
public class PaperBook extends Book {
	
    private int stock;

    public PaperBook(String ISBN, String title, int year, double price, int stock) {
        super(ISBN, title, year, price);
        this.stock = stock;
    }

    @Override
    public boolean isForSale() {
        return true;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        if (quantity > stock) {
            throw new IllegalArgumentException("Quantum book store: Not enough stock for paper book.");
        }
        stock -= quantity;
        deliver(email, address);
        return getPrice() * quantity;
    }

    @Override
    public void deliver(String email, String address) {
        System.out.println("Quantum book store: Sending paper book to " + address + " via ShippingService.");
    }
}
