package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();

        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem( new Book("testauthor1", "Titletest1"));
        mediatheque.addItem( new Book("testauthor1", "Titletest2"));
        mediatheque.addItem( new CD(12, "Sergeant Peppers"));
        mediatheque.addItem( new CD(10, "Test1"));
        System.out.println("\n Voici tous le catalogue :");
        mediatheque.printCatalog();

        System.out.println("\n Maintenant que les Livres :");
        mediatheque.printOnlyBooks();

        System.out.println("\n Maintenant que les CD :");
        mediatheque.printOnlyCDs();
    }
}
