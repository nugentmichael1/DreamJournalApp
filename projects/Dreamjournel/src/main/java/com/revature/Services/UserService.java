package com.revature.Services;

import com.revature.Models.Dream;
import com.revature.Models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
     User saveUser(User user);
}
