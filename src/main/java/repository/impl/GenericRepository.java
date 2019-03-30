package repository.impl;

import entity.Human;
import entity.Address;
import repository.Repository;
import util.Util;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.random;

public class GenericRepository<Entity extends Human> implements Repository<Entity> {

    @Override
    public Entity get(Class<Entity> entityClass) {
        return getEntity(entityClass);
    }

    @Override
    public List<Entity> getAll(Class<Entity> entityClass) {
        return new ArrayList<Entity>(){{
            add(getEntity(entityClass));
            add(getEntity(entityClass));
            add(getEntity(entityClass));
        }};
    }

    @Override
    public void save(Entity entity) {
        System.out.println(entity.toString());
    }

    @Override
    public void saveAll(List<Entity> entities) {
        for (Entity entity : entities) {
            System.out.println(entity.toString());
        }
    }

    private Entity getEntity(Class entity){
        Entity entity1 = null;
        try {
            entity1 = (Entity) entity.getConstructor().newInstance();
            entity1.setId((long) (random() * 100));
            entity1.setName(entity1.getClass().getSimpleName());
            entity1.setBirthDate(Util.getRandomDate());
            entity1.setAddress( new Address("City",
                    "Street",
                    (int) (random() * 200)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entity1;
    }
}
