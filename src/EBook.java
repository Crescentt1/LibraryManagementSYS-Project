public class EBook extends Book {

    private String downloadLink;

    public EBook(int id, String title, String author, String downloadLink) {
        super(id, title, author);
        this.downloadLink = downloadLink;
    }

    @Override
    public String getBookType() {
        return "E Book";
    }
}