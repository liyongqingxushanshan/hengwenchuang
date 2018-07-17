package com.qfedu.service;


import com.qfedu.domain.User;

public interface UserService {
    boolean insert(User user);

    User queryByName(String username);
}
