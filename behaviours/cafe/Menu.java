package cafe;

import java.util.Iterator;

public interface Menu {
	public Iterator createIterator();
	public void addItem(String name, String description, boolean isVegetarian, double price);
}
