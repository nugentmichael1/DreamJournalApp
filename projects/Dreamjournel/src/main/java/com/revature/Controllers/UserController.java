package com.revature.Controllers;
import com.revature.Models.Dream;
import com.revature.Models.User;
import com.revature.Services.DreamService;
import com.revature.Services.UserService;
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
<<<<<<< HEAD
}
=======
}
>>>>>>> 9c73a5dc03eec89f760587bae0b9e144ea52aacf
