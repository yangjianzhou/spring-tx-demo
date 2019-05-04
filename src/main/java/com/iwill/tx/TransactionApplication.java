package com.iwill.tx;

import com.iwill.tx.bean.UserDto;
import com.iwill.tx.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TransactionApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        List<UserDto> userDtoList = userService.getUserListByName("zhangsan");
        System.out.println(userDtoList != null && userDtoList.size() == 1);
    }
}
