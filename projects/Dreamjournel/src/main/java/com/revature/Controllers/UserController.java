package com.revature.Controllers;
import com.revature.Models.Dream;
import com.revature.Models.User;
import com.revature.Services.DreamService;
import com.revature.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

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
    public User finduser (@RequestBody User user) {
        return US.findUsername(user.getUsername());

    }
    @GetMapping(value = "/login")
    public User loginuser (@RequestBody User user) {
        return US.findUsernameAndPassword(user.getUsername(),user.getPassword());

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





