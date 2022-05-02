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
        return Arrays.stream(users).map(User::getName).collect(Collectors.toList()).toArray(new String[users.length]);
    }

    public Long[] getUserIds() {
        return Arrays.stream(users).map(User::getId).collect(Collectors.toList()).toArray(new Long[users.length]);
    }

    public String getUserNameById(long id) {
        var user = Arrays.stream(users)
                .filter(customer -> id == customer.getId())
                .findAny()
                .orElse(null);
        if(user == null)
            return null;
        return user.getName();
    }
}
