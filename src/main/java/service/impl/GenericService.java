package service.impl;

import converter.impl.ManDtoToMan;
import converter.impl.WomanDtoToWoman;
import dto.ManDTO;
import dto.WomanDTO;
import entity.Human;
import repository.impl.GenericRepository;
import service.Service;

import java.util.ArrayList;
import java.util.List;

public class GenericService<Dto, Entity extends Human> implements Service<Dto, Entity>{

    private final GenericRepository<Entity> genericRepository = new GenericRepository<>();
    private final ManDtoToMan manDtoToMan = new ManDtoToMan();
    private final WomanDtoToWoman womanDtoToWoman = new WomanDtoToWoman();

    public Entity get(Class<Entity> entityClass) {
        return genericRepository.get(entityClass);
    }

    public List<Entity> getAll(Class<Entity> entityClass) {
        return genericRepository.getAll(entityClass);
    }

    public void save(Dto dto) {
        if (dto.getClass().getSimpleName().equals("ManDTO")){
            genericRepository.save((Entity) manDtoToMan.convert((ManDTO) dto));
        } else if (dto.getClass().getSimpleName().equals("WomanDTO")){
            genericRepository.save((Entity) womanDtoToWoman.convert((WomanDTO) dto));
        }
    }

    public void saveAll(List<Dto> listDto) {
        List<Entity> users = new ArrayList<>();

        Class cls = listDto.get(0).getClass();

        if (cls.getSimpleName().equals("ManDTO")){
            for (Dto dto : listDto) {
                users.add((Entity) manDtoToMan.convert((ManDTO) dto));
            }
        } else if (cls.getSimpleName().equals("WomanDTO")){
            for (Dto dto : listDto) {
                users.add((Entity) womanDtoToWoman.convert((WomanDTO) dto));
            }
        }

        genericRepository.saveAll(users);
    }

}
