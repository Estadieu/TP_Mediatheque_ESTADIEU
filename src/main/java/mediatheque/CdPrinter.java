package mediatheque;
//Permet de mettre en place si l'item est bien un Cd
public class CdPrinter implements ItemVisitor{
    public CdPrinter(){
    }
    public void visit (CD c){
        System.out.println(c.toString());
    }
    @Override
    public void visit(Book b) {
        // Do nothing if the item is a book
    }
}
