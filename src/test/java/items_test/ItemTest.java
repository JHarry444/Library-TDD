package items_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import items.Book;
import items.Journal;
import items.Map;

public class ItemTest {

	private Book book = new Book("Book", 1);
	private Map map = new Map("Map", "1994");
	private Journal journal = new Journal("Journal", "Barry");

	@Test
	public void testBookExists() {
		assertNotNull("Failed to create book", this.book);
	}

	@Test
	public void testMapExists() {
		assertNotNull("Failed to create map", this.map);
	}

	@Test
	public void testJournalExists() {
		assertNotNull("Failed to create journal", this.journal);
	}

	@Test
	public void testJournalGetSet() {
		this.journal.setAuthor("Kyle");
		assertEquals("Author setter has failed.", "Kyle", this.journal.getAuthor());
	}
	
	@Test
	public void testMapGetSet() {
		this.map.setPublished("2002");
		assertEquals("Map setter has failed.", "2002", this.map.getPublished());
	}
	
	@Test
	public void testBookGetSet() {
		this.book.setIsbn(4494);
		assertEquals("Book setter has failed.", 4494, this.book.getIsbn());
	}
	
	@Test
	public void itemGetSet() {
		this.book.setID(444);
		this.book.setAvailable(false);
		this.book.setName("Weapon");
		assertEquals("Set id has failed.", 444, this.book.getId());
		assertFalse("Set available has failed.", this.book.isAvailable());
		assertEquals("Set name has failed.", "Weapon", this.book.getName());
	}
	
}
