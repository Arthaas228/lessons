package lesson9.zad;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames() {
        String[] userNames = new String[users.length];
        for (int i = 0; i < users.length; ++i) {
            userNames[i] = users[i].getName();
        }
        return userNames;
    }

    public Long[] getUserIds() {
        Long[] userIds = new Long[users.length];
        for (int i = 0; i < users.length; ++i) {
            userIds[i] = users[i].getId();
        }
        return userIds;
    }

    public String getUserNameById(long id) {
        for (User user : users) {
            if (user.getId() == id)
                return user.getName();
        }
        return null;
    }
}
