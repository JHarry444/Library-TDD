package library_test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import items.Book;
import items.Item;
import items.Map;
import library.Library;
import member.Member;

public class LibraryTest {

	private Library lib = new Library(0,0);

	@Before
	public void init() {
		this.lib = new Library();
	}

	@Test
	public void testAddItem() {
		assertTrue("Failed to add item to library.", this.lib.addItem(new Book("Josh", 1)));
	}

	@Test
	public void testAddMember() {
		assertTrue("Failed to add member to library.", this.lib.addMember(new Member("JK")));
	}

	@Test
	public void testRemoveMember() {
		Member member = new Member("JK");
		this.lib.addMember(member);
		assertTrue("Failed to remove member from library.", this.lib.removeMember(member));
	}

	@Test
	public void testRemoveItemByID() {
		this.lib.addItem(new Book("LotR", 1));
		assertTrue("Failed to remove item from library.", this.lib.removeItemByID(0));
	}

	@Test
	public void testUpdateItemByID() {
		this.lib.addItem(new Book("LotR", 1));
		Map map = new Map("Atlas shrugged", "2004");
		map.setID(0);
		assertTrue("Failed to update item in library.", this.lib.updateItemByID(map));
	}
	
	@Test
	public void testItemNotFound() {
		assertFalse("Mistakenly found an item.",this.lib.updateItemByID(new Book("LotR", 1)));
	}
	
	@Test
	public void testCheckOut() {
		Item book = new Book("LotR", 1);
		Member member = new Member("Phillip");
		this.lib.addItem(book);
		this.lib.addMember(member);
		assertTrue("Failed to check out item.",this.lib.checkOut(book.getId(), member.getId()));
	}
	
	@Test
	public void testCheckIn() {
		Item book = new Book("LotR", 1);
		Member member = new Member("Phillip");
		this.lib.addItem(book);
		this.lib.addMember(member);
		book.setAvailable(false);
		member.getCheckedOutItems().add(book);
		assertTrue("Failed to check in item.",this.lib.checkIn(book.getId(), member.getId()));
	}
	
	@Test
	public void testCheckingInFails() {
		Item book = new Book("LotR", 1);
		Member member = new Member("Phillip");
		this.lib.addItem(book);
		this.lib.addMember(member);
		assertFalse("Wrongly checked in item.",this.lib.checkIn(book.getId(), member.getId()));
	}
	
	@Test
	public void testCheckOutFails() {
		Item book = new Book("LotR", 1);
		Member member = new Member("Phillip");
		this.lib.addItem(book);
		this.lib.addMember(member);
		book.setAvailable(false);
		member.getCheckedOutItems().add(book);
		assertFalse("Failed to check out item.",this.lib.checkOut(book.getId(), member.getId()));
	}
}
