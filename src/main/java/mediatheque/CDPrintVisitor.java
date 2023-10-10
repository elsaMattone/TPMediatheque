package mediatheque;

public class CDPrintVisitor implements Visitor {
    @Override
    public void visit(Book b) {}

    @Override
    public void visit(CD c) {
        System.out.println(c);
    }
}

