import java.util.ArrayList;
import java.util.List;

public class Main {
}

class User {
    private String username;
    private String password;
    private List<User> users = new ArrayList<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getUsers() {
        return users;
    }

    public void register(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        users.add(user);
    }
        }