package item;

public interface Item {
	String getTitle();
	ItemType getType();
	boolean isCheckedOut();
	void setCheckedOut(final boolean checkedOut);

}
