package com.sias.controller;

import com.sias.pojo.Dog;
import com.sias.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.annotation.DomHandler;
import java.util.List;

@RestController
@RequestMapping("/dog")
public class DogController {
    @Autowired
    private DogService dogService;

    @GetMapping
    public List<Dog> getAll(){
        return dogService.getDogAll();
    }

    @GetMapping("/{id}")
    public Dog getByid(@PathVariable Integer id){
        return dogService.getDogByid(id);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id){
        return dogService.deleteDog(id);
    }

    @PutMapping
    public boolean update(@RequestBody Dog dog){
        return dogService.updateDog(dog);
    }

    @PostMapping
    public boolean save(@RequestBody Dog dog){
        return dogService.saveDog(dog);
    }

}
