package items;

public class Book extends Item implements Readable{
	private int isbn;

	public Book(String name, int isbn) {
		super(name);
		this.isbn = isbn;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Override
	public void read() {
		System.out.println("Read book");
		
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", ID=" + getId() + ", name=" + getName() + "]";
	}
	
	
}
