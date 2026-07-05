public class LibraryService {
    private Library library;

    public LibraryService(Library library){
        this.library = library;

    }

    public void addBook(Book newBook){
        library.getBooks().add(newBook);

    }

    public void removeBook(Book removedBook){
        library.getBooks().remove(removedBook);

    }

    public void borrowBook(int bookID){
        for(Book book : library.getBooks()) {
            if(bookID == book.getID()){
                if(!book.isBorrowed()){
                    book.setBorrowed(true);
                    System.out.println("Book : Borrowed");
                } else {
                    System.out.println("Book: Already Borrowed");

                }
                return;
            }
        }
        System.out.println("Book not Found.");
    }

    public void searchBook(int bookID){
        for(Book book : library.getBooks()){
            if (book.getID() == bookID){
                System.out.println("Book " + bookID + " was found.");
                return;
            }
        }System.out.println("Book " + bookID + " was not found.");

    }

    public void displayBook(int bookID){
        for(Book book : library.getBooks()){
            if (book.getID() == bookID){
                System.out.println("Book ID: " + bookID + "\n" +
                                    "Book Title: " + book.getTitle() + "\n" +
                                    "Book Author: " + book.getAuthor() + "\n" +
                                    "Book Borrowed: " + book.isBorrowed() + "\n");
                return;
            }
        }System.out.println("Book " + bookID + " was not found.");
    }
}
