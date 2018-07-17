package com.qfedu.dao;


import com.qfedu.domain.User;

public interface UserMapper {
    int insert(User user);

    User queryByName(String username);

}
