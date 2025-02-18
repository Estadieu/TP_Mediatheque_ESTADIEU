package mediatheque;
//Fichier ItemVisitor 18/02/2025
//Interface ItemVisitor avec une methode visit() par sous classe de Item
public interface ItemVisitor{
    void visit(Book b);
    void visit(CD c);
}