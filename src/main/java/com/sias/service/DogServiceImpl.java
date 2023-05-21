package com.sias.service;

import com.sias.dao.DogDao;
import com.sias.pojo.Dog;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DogServiceImpl implements DogService{

    @Resource
    private DogDao dogDao;

    @Override
    public List<Dog> getDogAll() {
        return dogDao.getAll();
    }

    @Override
    public Dog getDogByid(Integer id) {
        return dogDao.getById(id);
    }

    @Override
    public Dog getDogBySex(String sex) {
        return dogDao.getBySex(sex);
    }

    @Override
    public Dog getDogByVariety(String variety) {
        return dogDao.getByVariety(variety);
    }

    @Override
    public boolean deleteDog(Integer id) {
        dogDao.delete(id);
        return true;
    }

    @Override
    public boolean updateDog(Dog dog) {
        dogDao.update(dog);
        return true;
    }

    @Override
    public boolean saveDog(Dog dog) {
        dogDao.save(dog);
        return true;
    }

}
