package org.example.spring_security_oauth2_session.repository;

import org.example.spring_security_oauth2_session.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUsername(String username);
}
