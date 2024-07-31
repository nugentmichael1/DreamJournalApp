package com.revature.Controllers;

import com.revature.Models.Dream;
import com.revature.Services.DreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dreams")
@CrossOrigin
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
        Dream dream = ds.getDream(id);
        System.out.println(dream);
        return dream;
    }
}
