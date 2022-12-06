public class User {
    private String email;
    private String username;
    private String password;

    public User(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    /* Getters */

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    /* Setters */

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /* Other methods */

    public Boolean login(String email, String password) {
        if(this.email == email && this.password == password) {
            return true;
        }

        return false;
    }

    public Boolean login(String username, String password) {
        if(this.username == username && this.password == password) {
            return true;
        }

        return false;
    }
}
