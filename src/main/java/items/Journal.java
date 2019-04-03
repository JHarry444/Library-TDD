package items;

public class Journal extends Item implements Readable {
	private String author;

	public Journal(String name, String author) {
		super(name);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void read() {
		System.out.println("Read Journal");
	}

	@Override
	public String toString() {
		return "Journal [author=" + author + ", ID=" + getId() + ", name=" + getName() + ", available=" + isAvailable()
				+ "]";
	}

}
