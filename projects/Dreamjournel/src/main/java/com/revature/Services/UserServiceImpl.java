package com.revature.Services;
import com.revature.Models.User;
import com.revature.Models.Dream;
import com.revature.repositories.UserRepo;
import com.revature.repositories.DreamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    DreamRepo DR;
    @Autowired
    UserRepo UR;

    @Override
    public List<User> getAllUser() {
        return UR.findAll();
    }
    @Override
    public User saveUser(User user){
        return UR.save(user);
    }
    @Override
    public User findUsername(String username){
       return  UR.findByUsername(username);

    }
    @Override
    public User findUsernameAndPassword(String username, String password){
        return UR.findByUsernameAndPassword(username,password);
    }
}
