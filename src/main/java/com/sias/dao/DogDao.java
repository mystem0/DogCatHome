package com.sias.dao;

import com.sias.pojo.Dog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DogDao {
    @Insert("insert into dog (id,name,sex,variety) values(null,#{name},#{sex},#{variety})")
    void save(Dog dog);
    @Update("update dog set name = #{name}, sex=#{sex}, description=#{description}, img=#{img}, variety=#{variety} where id = #{id}")
    void update(Dog dog);
    @Delete("delete from dog where id = #{id}")
    void delete(Integer id);
    @Select("select * from dog where id = #{id}")
    Dog getById(Integer id);
    @Select("select * from dog where sex = #{sex}")
    Dog getBySex(String sex);
    @Select("select * from dog where variety = #{variety}")
    Dog getByVariety(String variety);
    @Select("select * from dog")
    List<Dog> getAll();

}
