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

    public long[] getUserIds() {
        long[] userIds = new long[users.length];
        for (int i = 0; i < userIds.length; ++i) {
            userIds[i] = users[i].getId();

        }
        return userIds;
    }

    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name))
                return user;
        }
        return null;
    }

    public User getUserById(long id) {
        for (User user : users) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        for (User user : users) {
            if (user.getSessionId().equals(sessionId))
                return user;
        }
        return null;
    }
    public User Save(User user){

    }
}
