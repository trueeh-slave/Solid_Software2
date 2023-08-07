package manager;

import item.Item;
import item.ItemType;
public class LibraryManager {

	public double calculateLateFee(final ItemType itemType, final int daysLate) {
		// Calculate late fee based on item type
		if (itemType == itemType.BOOK) {
			return daysLate * 0.25;
		} else if (itemType == ItemType.DVD) {
			return daysLate * 0.50;
		} else {
			return 0.0;
		}
	}

	public void checkout(Item item) {
		if (item.isCheckedOut()) return;

		item.setCheckedOut(true);
		System.out.println(item.getTitle() + " checked out.");

	}

	public void returnItem(Item item) {
		if (!item.isCheckedOut()) return;

		item.setCheckedOut(false);
		System.out.println(item.getTitle() + " returned.");
	}
}
