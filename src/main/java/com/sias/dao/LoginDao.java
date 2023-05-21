package com.sias.dao;

import com.sias.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PostMapping;

public interface LoginDao {

    @Select("select * from user where userNumber=#{userNumber} and passWord=#{passWord}")
    User login(User user);
    @Insert("insert into user (id,userNumber,passWord,userName) values(null,#{userNumber},#{passWord},#{userName})")
    void save(User user);
}
