package com.ilearning.finalProject.services;


import com.ilearning.finalProject.models.User;

import java.util.List;

public interface UserService {

    void create(User user);

    List<User> findAll();

    boolean update(User user, int id);

    boolean delete(int id);
}
