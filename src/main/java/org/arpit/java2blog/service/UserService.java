package org.arpit.java2blog.service;


import com.google.common.collect.Lists;
import org.arpit.java2blog.model.User;
import org.arpit.java2blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return Lists.newArrayList(userRepository.findAll());
    }

    public User findById(int id) {
        return userRepository.findOne(id);
    }

}
