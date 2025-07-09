
public class DemoBook extends Book {
	
    public DemoBook(String ISBN, String title, int year) {
        super(ISBN, title, year, 0.0);
    }

    @Override
    public boolean isForSale() {
        return false;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        throw new UnsupportedOperationException("Quantum book store: Demo book is not for sale.");
    }

    @Override
    public void deliver(String email, String address) {
        System.out.println("Quantum book store: Demo book can't be delivered.");
    }
}
