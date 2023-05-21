package com.sias.service;

import com.sias.pojo.Dog;

import java.util.List;

public interface DogService {

    List<Dog> getDogAll();

    Dog getDogByid(Integer id);

    Dog getDogBySex(String sex);

    Dog getDogByVariety(String variety);

    boolean deleteDog(Integer id);

    boolean updateDog(Dog dog);

    boolean saveDog(Dog dog);

}
