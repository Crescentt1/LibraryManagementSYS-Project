public class Book implements Borrowable{

    private int id;
    private String title;
    private String author;
    private boolean borrowed;

    public Book(int id,String title,String author){
        this.id = id;
        this.author = author;
        this.title = title;
        this.borrowed = false;

    }

    public int getID(){
        return id;
    }

    public void setId(int newID){
        id = newID;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String newTitle){
        title = newTitle;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String newAuthor){
        author = newAuthor;
    }

    public boolean isBorrowed(){
        return borrowed;
    }

    public void setBorrowed(boolean newStatus){
        borrowed = newStatus;
    }

    public String getBookType() {
        return "Book";
    }


    @Override
    public void borrow() {
        borrowed = true;
    }

    @Override
    public void returnBook() {
        borrowed = false;
    }
}
