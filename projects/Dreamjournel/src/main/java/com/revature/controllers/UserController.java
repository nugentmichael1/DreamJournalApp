package com.revature.controllers;
import com.revature.models.User;
import com.revature.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    UserService US;
    // DS;

    @Autowired
    public UserController(UserService US) {
        this.US = US;
    }

    //@Autowired
    //public UserController(DreamService DS) {
//this.DS = DS;
    //}

    @GetMapping
    public List<User> getAllUser() {
        return US.getAllUser();
    }
   @PostMapping()
    public User postArtist(@RequestBody User user){
       return US.saveUser(user);
    }
  // @GetMapping("/{id}")
  //  public List<Dream> getAllDreamsByUser(@PathVariable int userid){
  //      return DS.getAllDreamsByUser(userid);
  //  }

}



