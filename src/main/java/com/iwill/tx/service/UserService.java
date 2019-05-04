package com.iwill.tx.service;

import com.iwill.tx.bean.UserDto;
import com.iwill.tx.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public List<UserDto> getUserListByName(String name) {
        userMapper.insert(new UserDto("zhangsan", 20));
        userMapper.insert(new UserDto("lisi", 22));
        int updateSize = userMapper.updateByName("zhangsan", 25);
        if (updateSize != 1) {
            throw new RuntimeException();
        }
        List<UserDto> userDtoList = userMapper.getByName(name);
        return userDtoList;
    }

}
