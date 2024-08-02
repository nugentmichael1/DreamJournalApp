package com.revature.controllers;
import com.revature.models.Dream;
import com.revature.models.User;
import com.revature.services.DreamService;
import com.revature.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {
    UserService US;

    @Autowired
    public UserController(UserService US) {
        this.US = US;
    }
}
