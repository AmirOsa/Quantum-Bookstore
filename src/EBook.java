
public class EBook extends Book {
	
    private String fileType;

    public EBook(String ISBN, String title, int year, double price, String fileType) {
        super(ISBN, title, year, price);
        this.fileType = fileType;
    }   

    public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	@Override
    public boolean isForSale() {
        return true;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        if (quantity > 1) {
            throw new IllegalArgumentException("Quantum book store: Only one eBook can be bought at a time.");
        }
        deliver(email, address);
        return getPrice();
    }

    @Override
    public void deliver(String email, String address) {
        System.out.println("Quantum book store: Sending eBook to " + email + " via MailService.");
    }
}
