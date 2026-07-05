public class User {

    private int id;
    private String name;

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getId(){
        return id;
    }

    public void setID(int newID){
        id = newID;
    }
}
