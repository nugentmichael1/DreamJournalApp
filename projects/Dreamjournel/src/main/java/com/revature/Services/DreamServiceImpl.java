package com.revature.Services;


import com.revature.Models.Dream;
import com.revature.repositories.UserRepo;
import com.revature.repositories.DreamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.revature.exceptions.ItemNotFoundException;
import org.springframework.transaction.annotation.Transactional;

@Transactional
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

   // @Override
   // public List<Dream> getAllDreamsByUser(int fk_userid){
    //    return dr.findAllDreambyuserId(fk_userid);
    //}

    @Override
    public Dream getDream(int id) {

//        Dream dream = dr.findDreamByDId(id);
//        System.out.println(dream);
        //return dr.findDreamById(id);

        Optional<Dream> dreamRetrieved = dr.findById(id);

        //Guard: Bad dream ID
        if(dreamRetrieved.isEmpty()){
            throw new ItemNotFoundException("Dream Journal Entry with ID " + id + " not found.");
        }

        return dreamRetrieved.get();
    }

    @Override
    public Dream addDream(Dream dream) {
        //ToDo: verify user supplied Dream object.  Throw exception if missing important values?
        Dream result = dr.save(dream);
        System.out.println("DreamServiceImpl:" + result);
        return result;
    }

    @Override
    public Dream updateDream(int id, Dream updatedDream) {
        //ToDo: Verify id matches user (authorization issue)

        //Verify dream id exists in database already.
        Optional<Dream> dreamCurrent = dr.findById(id);
        if (dreamCurrent.isEmpty()) {
            throw new ItemNotFoundException("Dream Journal Entry with ID " + id + " not found.");
        }

        Dream retrievedDream = dreamCurrent.get();
        //Update all pieces of dream supplied by user
        if (updatedDream.getThemes() != null) retrievedDream.setThemes(updatedDream.getThemes());
        if (updatedDream.getArchetypes() != null) retrievedDream.setArchetypes(updatedDream.getArchetypes());
        if (updatedDream.getDescription() != null) retrievedDream.setDescription(updatedDream.getDescription());

        //Update imageName if different.  Maybe we handle this in a separate function later.
//        if (updatedDream.getImageName() != 0) retrievedDream.setImageName(updatedDream.getImageName());
        //Update AI Interpretation if different.  Maybe we handle this in a separate function later.
//        if (updatedDream.getInterpretationAI() != null)
//        retrievedDream.setInterpretationAI(updatedDream.getInterpretationAI());

        if (updatedDream.getInterpretationUser() != null)
            retrievedDream.setInterpretationUser(updatedDream.getInterpretationUser());
        //Update Time Stamp to now()
        retrievedDream.setTimeStamp(updatedDream.getTimeStamp());

        return dr.save(updatedDream);

    }
}
