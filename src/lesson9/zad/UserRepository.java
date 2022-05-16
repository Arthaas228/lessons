package lesson9.zad;

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

    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name))
                return user;
        }
        return null;
    }

    private User findById(long id) {
        for (User user : users) {
            if (user != null && user.getId() == id)
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

    // part 4

    public User save(User user) {
        int indexOfEmptyUser = -1;
        for (int i = 0; i < users.length; i++) {
            if(users[i] == null)
                indexOfEmptyUser = i;
        }
        if(indexOfEmptyUser == -1)
            return null;

        var foundUser = findById(user.getId());
        if(foundUser != null)
            return null;
        users[indexOfEmptyUser] = user;
        return user;
    }
}
