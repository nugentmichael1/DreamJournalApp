package com.revature.Services;

import com.revature.Models.Dream;
import com.revature.repositories.DreamRepo;
import com.revature.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Dream getDream(int id){
//        Dream dream = dr.findDreamByDId(id);
//        System.out.println(dream);
        return dr.findDreamById(id);
    }
}
