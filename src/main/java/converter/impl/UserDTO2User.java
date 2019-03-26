package converter.impl;

import converter.Converter;
import dto.UserDTO;
import entity.User;

public class UserDTO2User implements Converter<UserDTO, User> {

    @Override
    public User convert(UserDTO userDTO) {

        return new User(userDTO.getId(),
                userDTO.getName(),
                userDTO.getBirthDate(),
                new User.Address(userDTO.getAddress().getCity(),
                        userDTO.getAddress().getStreetName(),
                        userDTO.getAddress().getFlatNumber()));
    }
}
