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
<<<<<<< HEAD
}
=======
}
>>>>>>> 9c73a5dc03eec89f760587bae0b9e144ea52aacf
