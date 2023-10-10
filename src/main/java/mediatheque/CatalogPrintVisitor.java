package mediatheque;

public class CatalogPrintVisitor implements Visitor {
    @Override
    public void visit(Book b) {
        System.out.println(b);
    }

    @Override
    public void visit(CD c) {
        System.out.println(c);
    }
}

