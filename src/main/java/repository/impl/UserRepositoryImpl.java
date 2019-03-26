package repository.impl;

import entity.User;
import repository.UserRepository;
import util.Util;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository<User> {

    @Override
    public User getUser() {
        return Util.initRandomUser();
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<User>(){{
            add(Util.initRandomUser());
            add(Util.initRandomUser());
            add(Util.initRandomUser());
        }};
    }

    @Override
    public void saveUser(User user) {
        System.out.println(user.toString());
    }

    @Override
    public void saveAllUsers(List<User> users) {
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}
