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
        String[] names = new String[countUsers()];
        int index = 0;
        for (User user : users) {
            if (user != null) {
                names[index] = user.getName();
                index++;
                System.out.println(names);
            }
        }
        return names;

    }

    public long[] getUserIds() {
        long[] ids = new long[countUsers()];
        int index = 0;
        for (User user : users) {
            if(user != null){
                ids[index] = user.getId();
                index++;

            }

        }
        return ids;

    }

    public String getUserNameById(long id) {
        for (User user : users) {
            if (user != null && user.getId() == id)
                return user.getName();
        }
        return null;
    }

    private int countUsers() {
        int countUsers = 0;
        for (User user : users) {
            if (user != null)
                countUsers++;
        }
        return countUsers;
    }

    public User getUserByName(String name) {
        for (User user : users) {
            if (user != null && user.getName().equals(name))
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
            if (user != null && user.getSessionId().equals(sessionId))
                return user;
        }
        return null;
    }

    // part 4

    public User save(User user) {
        int indexOfEmptyUser = -1;
        for (int i = 0; i < users.length; i++) {
            if (user != null && users[i] == null)
                indexOfEmptyUser = i;
        }
        if (indexOfEmptyUser == -1)
            return null;

        var foundUser = findById(user.getId());
        if (foundUser != null)
            return null;
        users[indexOfEmptyUser] = user;
        return user;
    }
    // part 5

    public User update(User user) {
        if (user == null)
            return null;
        var foundUser = findById(user.getId());
        if (foundUser == null)
            return null;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == user.getId()) {
                users[i] = user;
            }

        }
        return user;
    }

    public void delete(long id) {
        var user = findById(id);
        if (user == null)
            return;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null &&users[i].getId() == id) {
                users[i] = null;
            }
        }
    }
}

