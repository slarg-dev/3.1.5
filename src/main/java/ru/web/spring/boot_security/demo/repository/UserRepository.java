package ru.web.spring.boot_security.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import ru.web.spring.boot_security.demo.model.User;


import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<UserDetails> findByEmail(String email);
}
