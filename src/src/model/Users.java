package model;

public class Users {
    private int id; 
    private String user;
    private String password;
    private TypeUser type;

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getUser() {return user;}

    public void setUser(String user) {this.user = user;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public TypeUser getType() {
        return type;
    }

    public void setType(TypeUser type) {
        this.type = type;
    }

    public Users(int id, String user, String password, TypeUser type) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.type = type;
    }

    public Users() {
    }
}
