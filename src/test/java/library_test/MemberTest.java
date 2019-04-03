package library_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import member.Member;

public class MemberTest {
	private Member member;
	
	@Before
	public void init() {
		this.member = new Member(0, "Bill");
	}
	
	@Test
	public void testInit() {
		assertNotNull("Failed to create Member.", this.member);
	}
	
	@Test
	public void testSetName() {
		this.member.setName("Bob");
		assertEquals("Member name not set", "Bob", this.member.getName());
	}
	
	@Test
	public void testList() {
		assertTrue("List of checked out items is not empty.", this.member.getCheckedOutItems().isEmpty());
	}
}
