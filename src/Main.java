//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Library firstLibrary = new Library();

        LibraryService libraryService = new LibraryService(firstLibrary);

        Book book1 = new Book(1234,"The Masterpiece", "Author1");
        Book book2 = new Book(6789, "The Abomination", "Author2");

        Book book3 = new PrintedBook(3,"PrintedBook","PrintedAuthor","999");
        Book book4 = new EBook(4, "EBook","EAuthor","www.book.com");

        libraryService.addBook(book1);
        libraryService.addBook(book2);
        libraryService.addBook(book3);
        libraryService.addBook(book4);

        libraryService.searchBook(12534);
        libraryService.searchBook(6789);

        libraryService.displayBook(6789);
        libraryService.borrowBook(6789);


        for(Book book : firstLibrary.getBooks()){
            System.out.println(book.getBookType());
        }



    }
}