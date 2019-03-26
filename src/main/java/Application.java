import dto.UserDTO;
import service.impl.UserService;
import util.Util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        UserService userService = new UserService();
        List<UserDTO> userList = userService.getAllUsers();

        System.out.println("===============================");
        userService.addAllUsers(userList);
        System.out.println("===============================");
        userService.addUser(Util.initRandomUserDTO());
        System.out.println("===============================");
        for (UserDTO user : userList) {
            System.out.println(user.toString());
        }
        System.out.println("===============================");
        System.out.println(userService.getUser());

        Collections.sort(userList, Comparator.comparing(UserDTO::getId));
        System.out.println("\nSorted by Id");
        for (UserDTO user : userList) {
            System.out.println(user.toString());
        }

        Collections.sort(userList, Comparator.comparing(UserDTO::getBirthDate));
        System.out.println("\nSorted by birthDate");
        for (UserDTO user : userList) {
            System.out.println(user.toString());
        }

        Collections.sort(userList, Comparator.comparing(user -> user.getAddress().getFlatNumber()));
        System.out.println("\nSorted by flatNumber");
        for (UserDTO user : userList) {
            System.out.println(user.toString());
        }
    }


}
