package items;

public class Map extends Item  implements Readable{
	private String published;

	public Map(String name, String published) {
		super(name);
		this.published = published;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	@Override
	public void read() {
		System.out.println("Read Map");
	}

	@Override
	public String toString() {
		return "Map [published=" + published + ", ID=" + getId() + ", name=" + getName() + "]";
	}

}
