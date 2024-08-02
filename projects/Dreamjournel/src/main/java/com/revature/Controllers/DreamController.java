package com.revature.Controllers;
import com.revature.Models.Dream;
import com.revature.Services.DreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


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

        Dream dream = ds.getDream(id);
        System.out.println(dream);
        return dream;
    }
   //   @GetMapping("users/{id}")
    //  public Optional<Dream> getAllDreamsByUser(@PathVariable int userid){
    //    return ds.getAllDreamsByUser(userid);
   //   }


    @PostMapping(consumes = "application/json", produces = "application/json")
    public Dream addDream(@RequestBody Dream dream) {
        return ds.addDream(dream);
    }

    @PutMapping(value = "/{id}", consumes = "application/json", produces = "application/json")
    public Dream updateDream(@PathVariable int id, @RequestBody Dream dream) {
        Dream result = ds.updateDream(id, dream);
        System.out.println(result);
        return result;
    }

}
