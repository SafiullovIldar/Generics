package service;

import entity.Human;

import java.util.List;

public interface Service<Dto, Entity extends Human> {

    Entity get(Class<Entity> entityClass);
    List<Entity> getAll(Class<Entity> entityClass);
    void save(Dto dto);
    void saveAll(List<Dto> dtoList);

}
