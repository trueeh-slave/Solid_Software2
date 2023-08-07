import item.Item;
import item.ItemType;
import item.implementation.LibraryItem;
import manager.LibraryManager;

public class LibraryApp {
	private static final LibraryManager libraryManager = new LibraryManager();

	public static void main(String[] args) {
		//Creating Objects

		final Item book = new LibraryItem("Introduction to Java", ItemType.BOOK);
		final Item dvd = new LibraryItem("Action Movie", ItemType.DVD);

		//Checkout

		libraryManager.checkout(book);
		libraryManager.checkout(dvd);

		//Return

		libraryManager.returnItem(book);
		libraryManager.returnItem(dvd);

		//Fee

		double bookLateFee = libraryManager.calculateLateFee(book.getType(), 5);
		double dvdLateFee = libraryManager.calculateLateFee(dvd.getType(), 3);

		System.out.println("Late fee for book: $" + bookLateFee);
		System.out.println("Late fee for DVD: $" + dvdLateFee);
	}
}
