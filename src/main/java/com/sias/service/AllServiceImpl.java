package com.sias.service;

import com.sias.dao.AllDao;
import com.sias.pojo.Pet;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AllServiceImpl implements AllService {
    @Resource
    private AllDao dao;
    @Override
    public List<Pet> selectAll() {
        return dao.selectAll();
    }
}
