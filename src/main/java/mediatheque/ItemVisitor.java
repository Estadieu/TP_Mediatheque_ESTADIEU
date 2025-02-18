package mediatheque;
//Interface ItemVisitor avec une methode visit() par sous classe de Item
public interface ItemVisitor{
    void visit(Book b);
    void visit(CD c);
}