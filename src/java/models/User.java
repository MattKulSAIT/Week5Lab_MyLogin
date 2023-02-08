package models;

/**
 *
 * @author mdkul
 * Not show where the user object comes from but ok.
 */
public class User {
    
    private String username;
    private String password;
    public User(){};
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    public static User login(String username, String password){
        if(password.equals("password") && username.equals("abe")|| username.equals("barb")){
            User person = new User(username, password);
            return person;
        }
        else{
            return null;
       }
    }

    
}
