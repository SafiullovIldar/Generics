package repository;

import entity.Human;

import java.util.List;

public interface Repository<Entity extends Human> {

    Entity get(Class<Entity> entityClass);
    List<Entity> getAll(Class<Entity> entityClass);
    void save(Entity entity);
    void saveAll(List<Entity> entities);
}
