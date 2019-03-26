package service;

import java.util.List;

public interface Service<T> {

    T getUser();
    List<T> getAllUsers();
    void addUser(T userDTO);
    void addAllUsers(List<T> usersDTO);

}
