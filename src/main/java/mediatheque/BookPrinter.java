package mediatheque;
//Fichier BookPrinter 18/02/2025
//Permet de mettre en place si l'item est bien un Book
public class BookPrinter implements ItemVisitor{
    public BookPrinter(){
    }
    public void visit (Book b){
        System.out.println(b.toString());
    }
    @Override
    public void visit(CD c) {
        // Do nothing if the item is a CD
    }
}
