package items;

public abstract class Item {

	private static int _id;
	private int id;
	private String name;
	private boolean available = true;

	public Item(String name) {
		super();
		this.id = _id++;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void setID(int id) {
		
	}

	public void setName(String name) {
		this.name = name;
	}

}
