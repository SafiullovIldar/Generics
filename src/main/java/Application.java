import dto.UserDTO;
import entity.User;
import service.impl.GenericService;
import util.Util;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        GenericService<UserDTO, User> genericService = new GenericService<>();
        List<User> userList = genericService.getAll(User.class);

        System.out.println("===============================");
        genericService.saveAll(Arrays.asList(Util.initRandomUserDTO(),
                                            Util.initRandomUserDTO()));
        System.out.println("===============================");
        genericService.save(Util.initRandomUserDTO());
        System.out.println("===============================");
        for (User user : userList) {
            System.out.println(user.toString());
        }
        System.out.println("===============================");
        System.out.println(genericService.get(User.class));


        Collections.sort(userList, Comparator.comparing(User::getId));
        System.out.println("\nSorted by Id");
        for (User user : userList) {
            System.out.println(user.toString());
        }

        Collections.sort(userList, Comparator.comparing(User::getBirthDate));
        System.out.println("\nSorted by birthDate");
        for (User user : userList) {
            System.out.println(user.toString());
        }

        Collections.sort(userList, Comparator.comparing(user -> user.getAddress().getFlatNumber()));
        System.out.println("\nSorted by flatNumber");
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }


}
