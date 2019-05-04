package com.iwill.tx.dao;

import com.iwill.tx.bean.UserDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    void insert(UserDto userDto);

    int updateByName(@Param("name") String name, @Param("age") int age);

    List<UserDto> getByName(String name);

}
