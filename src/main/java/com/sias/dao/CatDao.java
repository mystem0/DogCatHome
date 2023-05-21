package com.sias.dao;

import com.sias.pojo.Cat;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CatDao {
    @Insert("insert into cat (id,name,sex,variety) values(null,#{name},#{sex},#{variety})")
    void save(Cat cat);
    @Update("update cat set name = #{name}, sex=#{sex}, description=#{description}, img=#{img} ,variety=#{variety} where id = #{id}")
    void update(Cat cat);
    @Delete("delete from cat where id = #{id}")
    void delete(Integer id);
    @Select("select * from cat where id = #{id}")
    Cat getById(Integer id);
    @Select("select * from cat where sex = #{sex}")
    Cat getBySex(String sex);
    @Select("select * from cat where variety = #{variety}")
    Cat getByVariety(String variety);
    @Select("select * from cat")
    List<Cat> getAll();
}
