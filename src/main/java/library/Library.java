package library;

import java.util.ArrayList;
import java.util.List;

import items.Item;
import member.Member;

public class Library {
	private List<Member> members = new ArrayList<>();
	private List<Item> items = new ArrayList<>();

	private int itemID;
	private int memberID;

	public Library() {
		super();
	}

	public Library(int itemID, int memberID) {
		super();
		this.itemID = itemID;
		this.memberID = memberID;
	}

	public boolean checkOut(int itemID, int memberID) {
		Item item = this.items.stream().filter(i -> i.getId() == itemID).findFirst().orElse(null);
		Member member = this.members.stream().filter(m -> m.getId() == memberID).findFirst().orElse(null);
		if (item == null || !item.isAvailable() || member == null) {
			return false;
		} else {
			item.setAvailable(false);
			member.getCheckedOutItems().add(item);
			return true;
		}
	}

	public boolean checkIn(int itemID, int memberID) {
		Item item = this.items.stream().filter(i -> i.getId() == itemID).findFirst().orElse(null);
		Member member = this.members.stream().filter(m -> m.getId() == memberID).findFirst().orElse(null);
		if (item == null || item.isAvailable() || member == null) {
			return false;
		} else {
			item.setAvailable(true);
			member.getCheckedOutItems().remove(item);
			return true;
		}
	}

	public boolean addItem(Item item) {
		item.setID(this.itemID++);
		return this.items.add(item);
	}

	public boolean addMember(Member member) {
		member.setId(this.memberID++);
		return this.members.add(member);
	}

	public boolean removeMember(Member member) {
		return this.members.remove(member);
	}

	public boolean updateItemByID(Item item) {
		if (!this.removeItemByID(item.getId())) {
			return false;
		}
		return this.items.add(item);
	}

	public boolean removeItemByID(int id) {
		Item toRemove = this.items.stream().filter(i -> i.getId() == id).findFirst().orElse(null);
		if (toRemove != null) {
			return this.items.remove(toRemove);
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Library [members=" + members + ", items=" + items + "]";
	}
}
