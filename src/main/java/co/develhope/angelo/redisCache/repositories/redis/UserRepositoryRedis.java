package co.develhope.angelo.redisCache.repositories.redis;

import co.develhope.angelo.redisCache.entities.redis.UserRedis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryRedis extends PagingAndSortingRepository<UserRedis, Long> {
}
