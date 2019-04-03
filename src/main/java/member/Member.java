package member;

import java.util.ArrayList;
import java.util.List;

import items.Item;

public class Member {

	private int id;
	
	private String name;
	
	private List<Item> checkedOutItems = new ArrayList<>();

	public Member(String name) {
		super();
		this.name = name;
	}

	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Item> getCheckedOutItems() {
		return checkedOutItems;
	}

	public void setCheckedOutItems(List<Item> checkedOutItems) {
		this.checkedOutItems = checkedOutItems;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", checkedOutItems=" + checkedOutItems + "]";
	}
	
}
