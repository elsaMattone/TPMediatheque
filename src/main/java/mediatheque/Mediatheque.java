package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}

	public void printCatalog() {
		CatalogPrintVisitor catalogVisitor = new CatalogPrintVisitor();
		for (Item i : items)
			i.accept(catalogVisitor);
	}

	public void printOnlyBooks() {
		BookPrintVisitor bookVisitor = new BookPrintVisitor();
		for (Item i : items) {
			i.accept(bookVisitor);
		}
	}


	public void printOnlyCDs() {
		CDPrintVisitor cdVisitor = new CDPrintVisitor();
		for (Item i : items) {
			i.accept(cdVisitor);
		}
	}
}
