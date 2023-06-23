package ru.web.spring.boot_security.demo.repository;


import org.springframework.data.repository.CrudRepository;
import ru.web.spring.boot_security.demo.model.Role;


public interface RoleRepository extends CrudRepository<Role, Integer> {
}
