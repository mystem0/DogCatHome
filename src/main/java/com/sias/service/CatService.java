package com.sias.service;

import com.sias.pojo.Cat;

import java.util.List;

public interface CatService {

    List<Cat> getCatAll();

    Cat getCatByid(Integer id);

    Cat getCatBySex(String sex);

    Cat getCatByVariety(String variety);

    boolean deleteCat(Integer id);

    boolean updateCat(Cat cat);

    boolean saveCat(Cat cat);

}
