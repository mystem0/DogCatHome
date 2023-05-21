package com.sias.service;

import com.sias.dao.CatDao;
import com.sias.pojo.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CatServiceImpl implements CatService{

    @Resource
    private CatDao catDao;

    @Override
    public List<Cat> getCatAll() {
        return catDao.getAll();
    }

    @Override
    public Cat getCatByid(Integer id) {
        return catDao.getById(id);
    }

    @Override
    public Cat getCatBySex(String sex) {
        return catDao.getBySex(sex);
    }

    @Override
    public Cat getCatByVariety(String variety) {
        return getCatByVariety(variety);
    }

    @Override
    public boolean deleteCat(Integer id) {
        catDao.delete(id);
        return true;
    }

    @Override
    public boolean updateCat(Cat cat) {
        catDao.update(cat);
        return true;
    }

    @Override
    public boolean saveCat(Cat cat) {
        catDao.save(cat);
        return true;
    }

}
