package converter.impl;

import converter.Converter;
import dto.UserDTO;
import entity.User;

public class User2UserDTO implements Converter<User, UserDTO> {

    @Override
    public UserDTO convert(User user) {

        return new UserDTO(user.getId(),
                user.getName(),
                user.getBirthDate(),
                new UserDTO.Address(user.getAddress().getCity(),
                        user.getAddress().getStreetName(),
                        user.getAddress().getFlatNumber()));
    }
}
