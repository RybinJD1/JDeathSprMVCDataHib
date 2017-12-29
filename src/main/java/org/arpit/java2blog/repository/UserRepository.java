package org.arpit.java2blog.repository;


import org.arpit.java2blog.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
