package co.develhope.angelo.redisCache.repositories.jpa;

import co.develhope.angelo.redisCache.entities.jpa.UserJPA;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryJPA extends JpaRepository<UserJPA, Long> {
}
