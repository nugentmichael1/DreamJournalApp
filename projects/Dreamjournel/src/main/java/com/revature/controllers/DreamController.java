package com.revature.controllers;

import com.revature.models.Dream;
import com.revature.services.DreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/dreams")
public class DreamController {
    DreamService ds;

    @Autowired // Constructor Injection
    public DreamController(DreamService ds) {
        this.ds = ds;
    }

    @GetMapping
    public List<Dream> getAllDreams() {
        return ds.getAllDreams();
    }

    @GetMapping("/{id}")
    public Dream getDream(@PathVariable int id) {
        return ds.getDream(id);
    }
     @GetMapping("/user/{fk_userid}")
     public List<Dream> getAllDreamsByUser(@PathVariable int fk_userid){
        return ds.getAllDreamsByUser(fk_userid);
       }


    @PostMapping(consumes = "application/json", produces = "application/json")
    public Dream addDream(@RequestBody Dream dream) {
        return ds.addDream(dream);
    }

    @PutMapping(value = "/{id}", consumes = "application/json", produces = "application/json")
    public Dream updateDream(@PathVariable int id, @RequestBody Dream dream) {
        return ds.updateDream(id, dream);
    }
    @PutMapping("/delete/{id}")
    public Dream deleteDreamById(@PathVariable int id){
    return ds.deleteDreamById(id);

    }

}
