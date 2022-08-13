package co.develhope.angelo.redisCache.services;

import co.develhope.angelo.redisCache.entities.jpa.UserJPA;
import co.develhope.angelo.redisCache.repositories.jpa.UserRepositoryJPA;
import co.develhope.angelo.redisCache.repositories.redis.UserRepositoryRedis;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserRepositoryJPA userRepositoryJPA;

    @Autowired
    private UserRepositoryRedis userRepositoryRedis;


    public void readAll() {

    }

    public void readOne(String id) {

    }

    public void update(UserJPA user) {
    }

    public void delete(String id) {

    }

    public void readOneFast(String id) {

    }
}



