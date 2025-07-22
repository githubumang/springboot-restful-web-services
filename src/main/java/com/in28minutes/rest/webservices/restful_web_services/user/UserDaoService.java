package com.in28minutes.rest.webservices.restful_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<User>();

    private static Integer countUser = 3;

    static {
        users.add(new User(1, "Umang", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Raju", LocalDate.now().minusYears(15)));
        users.add(new User(3, "Kamal", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findUserById(Integer id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User saveNewUser(User user) {
        user.setId(++countUser);
        users.add(user);
        return user;
    }
}
