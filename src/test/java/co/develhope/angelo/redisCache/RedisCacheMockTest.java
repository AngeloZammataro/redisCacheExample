package co.develhope.angelo.redisCache;

import co.develhope.angelo.redisCache.entities.jpa.UserJPA;
import co.develhope.angelo.redisCache.entities.redis.UserRedis;
import co.develhope.angelo.redisCache.repositories.redis.UserRepositoryRedis;
import co.develhope.angelo.redisCache.services.UserService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RedisCacheMock.class)
public class RedisCacheMockTest {

    @Autowired
    private UserRepositoryRedis userRepositoryRedis;

    @Autowired
    private UserService userService;

    @Test
    public void shouldWriteOneRedisCache(){
        UserRedis userRedis = new UserRedis();
        userRedis.setDomicileCity("myCity");
        userRedis.setId(1L);
        userRedis.setEmail("example@example.com");
        userRedis.setFirstName("myName");
        userRedis.setLastName("mySurname");

        UserRedis userSavedInRedisCache = userRepositoryRedis.save(userRedis);
        Assertions.assertNotNull(userSavedInRedisCache);
    }

    @Test
    public void shouldReadOneRedisCache(){
        UserJPA userReadInRedisCache = userService.readOne(1L);
        Assertions.assertNotNull(userReadInRedisCache);
    }
}
