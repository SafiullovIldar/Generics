package repository;

import java.util.List;

public interface UserRepository<T> {

    T getUser();
    List<T> getAllUsers();
    void saveUser(T user);
    void saveAllUsers(List<T> users);
}
