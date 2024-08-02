package com.revature.services;

import com.revature.models.User;
import com.revature.models.Dream;
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
public class DreamServiceImpl implements DreamService {

    @Autowired
    DreamRepo dr;

    @Autowired
    UserRepo ur;

    @Override
    public List<Dream> getAllDreams() {
        return dr.findAll();
    }

    @Override
    public Dream getDream(int id) {
//        Dream dream = dr.findDreamByDId(id);
//        System.out.println(dream);
        return dr.findDreamById(id);
    }
}
