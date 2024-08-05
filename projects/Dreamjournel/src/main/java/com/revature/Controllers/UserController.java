package com.revature.Controllers;
import com.revature.Models.User;
import com.revature.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping()
    public List<User> getAllUser() {
        return US.getAllUser();
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return US.saveUser(user);
    }

    @GetMapping(value = "/name")
    public ResponseEntity<Object> finduser(@RequestBody User user) {
       User user1 = US.findUsername(user.getUsername());
       if(user1!=null){
           return ResponseEntity.ok().body(user1);
       }else{
           return ResponseEntity.status(404).body("Username not found");

       }
            //return US.findUsername(user.getUsername());


    }

    @GetMapping(value = "/login")
    public ResponseEntity<Object> loginuser (@RequestBody User user) {
        User user1 = US.findUsernameAndPassword(user.getUsername(),user.getPassword());
        if(user1!=null){
            return ResponseEntity.ok().body(user1);
        }else{
            return ResponseEntity.status(404).body("Username and Password are incorrect");

        }

    }
   // @PutMapping("/delete")
   // public User deleteuser(@RequestBody User user){
   //     return US.deleteuser(user.getUsername());
   // }
}


  // @GetMapping("/{id}")
  //  public List<Dream> getAllDreamsByUser(@PathVariable int userid){
  //      return DS.getAllDreamsByUser(userid);
  //  }





