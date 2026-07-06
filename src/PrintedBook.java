public class PrintedBook extends Book{

    private String shelfNumber;

    public PrintedBook(int id, String title, String author, String shelfNumber) {
        super(id, title, author);
        this.shelfNumber = shelfNumber;
    }

    @Override
    public String getBookType() {
        return "Printed Book";
    }
}
