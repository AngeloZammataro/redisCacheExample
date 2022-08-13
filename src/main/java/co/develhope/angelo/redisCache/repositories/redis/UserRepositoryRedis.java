package co.develhope.angelo.redisCache.repositories.redis;

import co.develhope.angelo.redisCache.entities.redis.UserRedis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryRedis extends CrudRepository<UserRedis, Long> {
}
