import dto.ManDTO;
import dto.WomanDTO;
import entity.Man;
import entity.Woman;
import service.impl.GenericService;
import util.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        GenericService<ManDTO, Man> manService = new GenericService<>();
        List<Man> manList = manService.getAll(Man.class);

        GenericService<WomanDTO, Woman> womanService = new GenericService<>();
        List<Woman> womanList = womanService.getAll(Woman.class);

        List<ManDTO> manDTOList = new ArrayList<>();
        manDTOList.add(Util.initRandomManDTO());
        manDTOList.add(Util.initRandomManDTO());

        List<WomanDTO> womanDTOList = new ArrayList<>();
        womanDTOList.add(Util.initRandomWomanDTO());
        womanDTOList.add(Util.initRandomWomanDTO());

        System.out.println("===============================");
        manService.saveAll(manDTOList);
        womanService.saveAll(womanDTOList);

        System.out.println("===============================");
        manService.save(Util.initRandomManDTO());
        womanService.save(Util.initRandomWomanDTO());

        System.out.println("===============================");
        for (Man man : manList) {
            System.out.println(man.toString());
        }
        for (Woman woman : womanList) {
            System.out.println(woman.toString());
        }

        System.out.println("===============================");
        System.out.println(manService.get(Man.class));
        System.out.println(womanService.get(Woman.class));


        Collections.sort(manList, Comparator.comparing(Man::getId));
        System.out.println("\nSorted by Id");
        for (Man man : manList) {
            System.out.println(man.toString());
        }

        Collections.sort(manList, Comparator.comparing(Man::getBirthDate));
        System.out.println("\nSorted by birthDate");
        for (Man man : manList) {
            System.out.println(man.toString());
        }

        Collections.sort(manList, Comparator.comparing(myMan -> myMan.getAddress().getFlatNumber()));
        System.out.println("\nSorted by flatNumber");
        for (Man man : manList) {
            System.out.println(man.toString());
        }
    }
}
