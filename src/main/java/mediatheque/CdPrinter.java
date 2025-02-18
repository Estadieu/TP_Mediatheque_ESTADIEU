package mediatheque;
//Fichier CdPrinter 18/02/2025
//Permet de mettre en place si l'item est bien un Cd
public class CdPrinter implements ItemVisitor{
    public CdPrinter(){
    }
    public void visit (CD c){
        //Affichage
        c.print();
    }
    @Override
    public void visit(Book b) {
        // Do nothing if the item is a book
    }
}
