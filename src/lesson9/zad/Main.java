package lesson9.zad;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        User[] users = new User[10];
        User user = new User(1, "user1", "session_id1");
        User user1 = new User(2, "user2", "session_id2");
        User user2 = new User(3, "user3", "session_id3");
        User user3 = new User(4, "user4", "session_id4");
        User user4 = new User(5, "user5", "session_id5");
        User user5 = new User(6, "user6", "session_id6");
        User user6 = new User(7, "user7", "session_id7");
        User user7 = new User(8, "user8", "session_id8");
        User user8 = new User(9, "user9", "session_id9");
        User user9 = new User(10, "user10", "session_id10");


        users[0] = user;
        users[1] = user1;
        users[2] = user2;
        users[3] = user3;
        users[4] = user4;
        users[5] = user5;
        users[6] = user6;
        users[7] = user7;
        users[8] = user8;
        users[9] = user9;

        UserRepository userRepository = new UserRepository(users);


        User[] users1 = userRepository.getUsers();
        System.out.println(Arrays.toString(users1));

        String[] usersName = userRepository.getUserNames();
        System.out.println(Arrays.toString(usersName));

        Long[] usersId = userRepository.getUserIds();
        System.out.println(Arrays.toString(usersId));

        String name = userRepository.getUserNameById(4);
        System.out.println(name);

        User getUser = userRepository.getUserByName("user4");
        User getUserById = userRepository.getUserBySessionId("session_id10");

        User user10 = userRepository.save(new User(11, "user11", "session11") );

        User updateUser = userRepository.update(new User(5, "newName", "session5") );

        userRepository.delete(6);
        System.out.println(Arrays.toString( userRepository.getUsers()));







    }
}
