package item.implementation;

import item.Item;
import item.ItemType;

public final class LibraryItem implements Item {

	private final String title;
	private final ItemType type;
	private boolean checkedOut = false;

	public LibraryItem(final String title, final ItemType type) {
		this.title = title;
		this.type = type;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public ItemType getType() {
		return type;
	}

	@Override
	public boolean isCheckedOut() {
		return checkedOut;
	}

	@Override
	public void setCheckedOut(final boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
}
