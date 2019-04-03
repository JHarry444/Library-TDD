package main;

import items.Book;
import library.Library;
import member.Member;

public class App {
	public static void main(String[] args) {
		Library lib = new Library();
		lib.addItem(new Book("LotR", 1));
		lib.addItem(new Book("LotR 2", 2));
		lib.addItem(new Book("LotR 3", 3));
		lib.addMember(new Member("Jordan"));
		lib.addMember(new Member("Chester"));
		lib.addMember(new Member("Chris"));
		System.out.println(lib);
	}
}
