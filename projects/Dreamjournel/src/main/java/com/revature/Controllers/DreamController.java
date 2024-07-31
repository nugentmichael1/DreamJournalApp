package com.revature.Controllers;
import com.revature.Models.Dream;
import com.revature.Models.User;
import com.revature.Services.DreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

public class DreamController {
    DreamService DS;
}
