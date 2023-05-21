package com.sias.dao;

import com.sias.pojo.Pet;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AllDao {
    @Select("select * from cat union select * from dog")
    List<Pet> selectAll();
}
