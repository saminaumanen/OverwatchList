package fi.haagahelia.domain;

import org.springframework.data.repository.CrudRepository;

import fi.haagahelia.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}