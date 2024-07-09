import java.util.ArrayList;
import java.util.List;

public class Main {
    private static class User {
        private String username;
        private String password;

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
    }

    private static List<User> users = new ArrayList<>();

    public static void register(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        users.add(user);
    }

    public static void main(String[] args) {

    }
}
