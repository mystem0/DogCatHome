package com.sias.controller;

import com.sias.pojo.Cat;
import com.sias.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cat")
public class CatController {
    @Autowired
    private CatService catService;

    @GetMapping
    public List<Cat> getAll() {
        return catService.getCatAll();
    }

    @GetMapping("/{id}")
    public Cat getByid(@PathVariable Integer id) {
        return catService.getCatByid(id);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return catService.deleteCat(id);
    }

    @PutMapping()
    public boolean update(@RequestBody Cat cat) {
        return catService.updateCat(cat);
    }

    @PostMapping()
    public boolean save(@RequestBody Cat cat) {
        System.out.println(cat);
        return catService.saveCat(cat);
    }
}
