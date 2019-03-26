package service.impl;

import converter.impl.User2UserDTO;
import converter.impl.UserDTO2User;
import dto.UserDTO;
import entity.User;
import repository.impl.UserRepositoryImpl;
import service.Service;

import java.util.ArrayList;
import java.util.List;

public class UserService implements Service<UserDTO> {

    private final UserRepositoryImpl userRepository = new UserRepositoryImpl();
    private final UserDTO2User userDTO2User = new UserDTO2User();
    private final User2UserDTO user2UserDTO = new User2UserDTO();

    @Override
    public UserDTO getUser() {
        return user2UserDTO.convert(userRepository.getUser());
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserDTO> userDTOList = new ArrayList<>();

        for (User user : userRepository.getAllUsers()) {
            userDTOList.add(user2UserDTO.convert(user));
        }
        return userDTOList;
    }

    @Override
    public void addUser(UserDTO userDTO) {
        userRepository.saveUser(userDTO2User.convert(userDTO));
    }

    @Override
    public void addAllUsers(List<UserDTO> usersDTO) {
        List<User> users = new ArrayList<>();

        for (UserDTO userDTO : usersDTO) {
            users.add(userDTO2User.convert(userDTO));
        }

        userRepository.saveAllUsers(users);
    }

}
