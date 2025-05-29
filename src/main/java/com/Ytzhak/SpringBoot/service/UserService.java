package com.Ytzhak.SpringBoot.service;

import com.Ytzhak.SpringBoot.model.User;
import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findAll();
    User findById(Long id);
    void deleteById(Long id);
}
