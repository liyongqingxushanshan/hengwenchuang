package com.qfedu.service.imple;

import com.qfedu.dao.UserMapper;
import com.qfedu.domain.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImple implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public boolean insert(User user) {
        return mapper.insert(user) > 0;
    }

    @Override
    public User queryByName(String username) {
        return mapper.queryByName(username);
    }
}
